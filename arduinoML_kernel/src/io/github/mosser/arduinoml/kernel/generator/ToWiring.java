package io.github.mosser.arduinoml.kernel.generator;

import java.util.List;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.*;
import io.github.mosser.arduinoml.kernel.structural.*;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {
	enum PASS {ONE, TWO}


	public ToWiring() {
		this.result = new StringBuffer();
	}

	private void w(String s) {
		result.append(String.format("%s",s));
	}

	@Override
	public void visit(App app) {
		//first pass, create global vars
		context.put("pass", PASS.ONE);
		w("// Wiring code generated from an ArduinoML model\n");
		w(String.format("// Application name: %s\n", app.getName())+"\n");

		w("long debounce = 200;\n");
		w("\nenum STATE {");
		String sep ="";
		for(State state: app.getStates()){
			w(sep);
			state.accept(this);
			sep=", ";
		}
		w("};\n");
		if (app.getInitial() != null) {
			w("STATE currentState = " + app.getInitial().getName()+";\n");
		}

		for(Brick brick: app.getBricks()){
			brick.accept(this);
		}

		//second pass, setup and loop
		context.put("pass",PASS.TWO);
		w("\nvoid setup(){\n");
		for(Brick brick: app.getBricks()){
			brick.accept(this);
		}
		w("}\n");

		w("\nvoid loop() {\n" +
			"\tswitch(currentState){\n");
		for(State state: app.getStates()){
			state.accept(this);
		}
		w("\t}\n" +
			"}");
	}

	@Override
	public void visit(Actuator actuator) {
		if(context.get("pass") == PASS.ONE) {
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			w(String.format("	pinMode(%d, OUTPUT); // %s [Actuator]\n", actuator.getPin(), actuator.getName()));
			return;
		}
	}


	@Override
	public void visit(Sensor sensor) {
		if(context.get("pass") == PASS.ONE) {
			w(String.format("\nboolean %sBounceGuard = false;\n", sensor.getName()));
			w(String.format("long %sLastDebounceTime = 0;\n", sensor.getName()));
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			w(String.format("	pinMode(%d, INPUT);  // %s [Sensor]\n", sensor.getPin(), sensor.getName()));
			return;
		}
	}

	@Override
	public void visit(State state) {
		if(context.get("pass") == PASS.ONE){
			w(state.getName());
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			// ajout des accolades au case pour definir variable dedans
			w("\t\tcase " + state.getName() + ": {\n");
			for (Action action : state.getActions()) {
				action.accept(this);
			}
			
			if (state.getTemporal() > -1) {
				w("\t\t\tint time" + state.getName() +" = millis();\n");
				w("\t\t\twhile(millis() < time" + state.getName() +" + " + state.getTemporal() + ") {\n");
				visitTransitionsThatExitTemporal(state.getTransitionsThatExitTemporal());
				w("\t\t\t}\n");
				List<Transition> transitions = state.getTransitionsAfterTemporal();
				transitions.addAll(state.getTransitionsThatExitTemporal());
				visitTransitionsAfterTemporal(transitions, state.getName());
			} else {
				visitTransitions(state.getTransitions());
			}
			w("\t\t} break;\n");
			return;
		}
	}
	
	public void visitTransitionsAfterTemporal(List<Transition> transitions, String stateName) {
		w("\t\t\twhile(currentState == " + stateName  + "){\n");
		for (Transition t : transitions) {
			if (t.getTemporal() > -1 && t.getConditions().size() == 1) {
				w("\t\t\t\tcurrentState = " + t.getNext().getName() + ";\n");
			} else {
				visitTransitionThatExitTemporal(t);
			}
		}
		w("\t\t\t}\n");
	}
	
	public void visitTransitionsThatExitTemporal(List<Transition> transitions) {
		for (Transition t : transitions) {
			visitTransitionThatExitTemporal(t);
		}
	}
	
    public void visitTransitionThatExitTemporal(Transition transition) {
		if(context.get("pass") == PASS.ONE) {
			return;
		}
		if(context.get("pass") == PASS.TWO) {

			for (Condition c : transition.getConditions()) {
				if (c instanceof LogicalCondition) {
					LogicalCondition lc = (LogicalCondition) c;
					String sensorName = lc.getSensor().getName();
					w(String.format("\t\t\t\t%sBounceGuard = millis() - %sLastDebounceTime > debounce;\n", sensorName, sensorName));
				}
			}
			
            wNoNewLine(String.format("\t\t\t\tif("));
            for (int i = 0; i < transition.getConditions().size(); i++) {
                this.visit(transition.getConditions().get(i));
                if (i < transition.getConditions().size() -1) {
                	if (transition.getConditions().get(i + 1) instanceof LogicalCondition) {
	                    if (transition.getOperation().equals(OPERATION.AND)) {
	                        wNoNewLine(String.format(" && "));
	                    } else {
	                        wNoNewLine(String.format(" || "));
	                    }
                	}
                }
            }
            w(String.format(") {\n"));
			for (Condition c : transition.getConditions()) {
				if (c instanceof LogicalCondition) {
					LogicalCondition lc = (LogicalCondition) c;
					String sensorName = lc.getSensor().getName();
					w(String.format("\t\t\t\t\t%sLastDebounceTime = millis();\n", sensorName));
				}
			}
             w("\t\t\t\t\tcurrentState = " + transition.getNext().getName() + ";\n");
             w("\t\t\t\t\tbreak;\n");
			w("\t\t\t\t}\n");
		}
    }
	
	public void visitTransitions(List<Transition> transitions) {
		for (Transition t : transitions) {
			this.visit(t);
		}
	}

	@Override
    public void visit(Transition transition) {
		if(context.get("pass") == PASS.ONE) {
			return;
		}
		if(context.get("pass") == PASS.TWO) {

			for (Condition c : transition.getConditions()) {
				if (c instanceof LogicalCondition) {
					LogicalCondition lc = (LogicalCondition) c;
					String sensorName = lc.getSensor().getName();
					w(String.format("\t\t\t%sBounceGuard = millis() - %sLastDebounceTime > debounce;\n", sensorName, sensorName));
				}
			}
			
            wNoNewLine(String.format("\t\t\tif("));
            for (int i = 0; i < transition.getConditions().size(); i++) {
                this.visit(transition.getConditions().get(i));
                if (i < transition.getConditions().size() -1) {
                	if (transition.getConditions().get(i + 1) instanceof LogicalCondition) {
	                    if (transition.getOperation().equals(OPERATION.AND)) {
	                        wNoNewLine(String.format(" && "));
	                    } else {
	                        wNoNewLine(String.format(" || "));
	                    }
                	}
                }
            }
            w(String.format(") {\n"));
			for (Condition c : transition.getConditions()) {
				if (c instanceof LogicalCondition) {
					LogicalCondition lc = (LogicalCondition) c;
					String sensorName = lc.getSensor().getName();
					w(String.format("\t\t\t\t%sLastDebounceTime = millis();\n", sensorName));
				}
			}
             w("\t\t\t\tcurrentState = " + transition.getNext().getName() + ";\n");
			w("\t\t\t}\n");
        }
    }
	
	@Override
    public void visit(LogicalCondition condition) {
		if(context.get("pass") == PASS.ONE) {
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			String sensorName = condition.getSensor().getName();
	        if (condition.getSensor() instanceof SensorDigital) {
	            wNoNewLine(String.format("(digitalRead(%d) == %s && %sBounceGuard)", condition.getSensor().getPin(), condition.getValue(), sensorName));
	        } else {
	            wNoNewLine(String.format("(analogRead(%d) == %s && %sBounceGuard)", condition.getSensor().getPin(), condition.getValue(), sensorName));
	        }
		}
    }
	
	@Override
    public void visit(TemporalCondition condition) { }
	
	@Override
    public void visit(Condition condition) {
		if (condition instanceof TemporalCondition)
			this.visit((TemporalCondition) condition);
		else if (condition instanceof LogicalCondition)
			this.visit((LogicalCondition) condition);
	}
	
	@Override
	public void visit(Action action) {
		if(context.get("pass") == PASS.ONE) {
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			w(String.format("\t\t\tdigitalWrite(%d,%s);\n",action.getActuator().getPin(),action.getValue()));
			return;
		}
	}
	
	private void wNoNewLine(String s) {
        result.append(String.format("%s",s));
    }

}