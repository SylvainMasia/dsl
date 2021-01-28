package polytech.dsl.spaceteam.internal.spaml;

import java.util.ArrayList;
import java.util.List;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.structural.Brick;

public class ConvertToMosserClasses {
    Program program;

    public ConvertToMosserClasses(Program program) {
        this.program = program;
    }

    public String generateArduinoCode() {
    	App app = new App();
		
		app.setBricks(constructPluggedElements(program));
		app.setInitial(constructInitialState(program));
		app.setStates(constructStates(program));
		
		ToWiring toWiring = new ToWiring();
		toWiring.visit(app);
		return toWiring.getResult().toString();
    }
    
    private List<Brick> constructPluggedElements(Program program) {
		List<Brick> bricks = new ArrayList<Brick>();
		for (PluggedElement pe : program.getPluggedElements()) {
			bricks.add(convertSpamlBrickToMosserBrick(pe));
		}
		return bricks;
	}
	
	private Brick convertSpamlBrickToMosserBrick(PluggedElement pe) {
		if (pe instanceof Sensor) {
			return convertSpamlSensorToMosser((Sensor) pe);
		} else if (pe instanceof Actuator) {
			return convertSpamlActuatorToMosser((Actuator) pe);
		}
		return null;
	}
	
	private io.github.mosser.arduinoml.kernel.structural.Sensor convertSpamlSensorToMosser(Sensor pe) {
		if (pe instanceof SensorAnalog) {
			io.github.mosser.arduinoml.kernel.structural.SensorAnalog sensor = new io.github.mosser.arduinoml.kernel.structural.SensorAnalog();
			sensor.setName(pe.name);
			sensor.setPin(pe.pin);
			return sensor;
		} else if (pe instanceof SensorDigital) {
			io.github.mosser.arduinoml.kernel.structural.SensorDigital sensor = new io.github.mosser.arduinoml.kernel.structural.SensorDigital();
			sensor.setName(pe.name);
			sensor.setPin(pe.pin);
			return sensor;
		}
		return null;
	}
	
	private io.github.mosser.arduinoml.kernel.structural.Actuator convertSpamlActuatorToMosser(Actuator pe) {
		io.github.mosser.arduinoml.kernel.structural.Actuator actuator = new io.github.mosser.arduinoml.kernel.structural.Actuator();
		actuator.setName(pe.name);
		actuator.setPin(pe.pin);
		return actuator;
	}
	
	private io.github.mosser.arduinoml.kernel.behavioral.State constructInitialState(Program program) {
		io.github.mosser.arduinoml.kernel.behavioral.State initialState = new io.github.mosser.arduinoml.kernel.behavioral.State();
		initialState.setName(program.getInitialState().getName());
		initialState.setTransitions(getTransitionsFromState(program.getInitialState()));
		initialState.setActions(getActionsFromState(program.getInitialState()));
		return initialState;
	}
	
	private io.github.mosser.arduinoml.kernel.behavioral.Condition convertConditionToMosser(Condition condition) {
		if (condition instanceof LogicalCondition) {
			io.github.mosser.arduinoml.kernel.behavioral.LogicalCondition mosserCondition = new io.github.mosser.arduinoml.kernel.behavioral.LogicalCondition();
			if (((LogicalCondition) condition).getValue() == SIGNAL.HIGH) {
				mosserCondition.setValue(io.github.mosser.arduinoml.kernel.structural.SIGNAL.HIGH);
			} else {
				mosserCondition.setValue(io.github.mosser.arduinoml.kernel.structural.SIGNAL.LOW);
			}
			mosserCondition.setSensor(convertSpamlSensorToMosser(((LogicalCondition) condition).getSensor()));
			return mosserCondition;
		} else {
			io.github.mosser.arduinoml.kernel.behavioral.TemporalCondition mosserCondition = new io.github.mosser.arduinoml.kernel.behavioral.TemporalCondition();
			mosserCondition.setDelay(((TemporalCondition) condition).getDelay());
			return mosserCondition;
		}
	}
	
	private List<io.github.mosser.arduinoml.kernel.behavioral.Transition> getTransitionsFromState(State state) {
		List<io.github.mosser.arduinoml.kernel.behavioral.Transition> transitions = new ArrayList<io.github.mosser.arduinoml.kernel.behavioral.Transition>();
		
		for (Transition t : state.getTransitions()) {
			io.github.mosser.arduinoml.kernel.behavioral.Transition transition = new io.github.mosser.arduinoml.kernel.behavioral.Transition();
			io.github.mosser.arduinoml.kernel.behavioral.State nextState = new io.github.mosser.arduinoml.kernel.behavioral.State();
			nextState.setName(t.getNext().getName());
			transition.setNext(nextState);
			
			if (t.getOperation() == OPERATION.AND) {
				transition.setOperation(io.github.mosser.arduinoml.kernel.structural.OPERATION.AND);
			} else {
				transition.setOperation(io.github.mosser.arduinoml.kernel.structural.OPERATION.OR);
			}
			
			List<io.github.mosser.arduinoml.kernel.behavioral.Condition> conditions = new ArrayList<io.github.mosser.arduinoml.kernel.behavioral.Condition>();
			for (Condition c : t.getConditions()) {
				conditions.add(convertConditionToMosser(c));
			}
			transition.setConditions(conditions);
			transitions.add(transition);
		}
		return transitions;
	}
	
	private List<io.github.mosser.arduinoml.kernel.behavioral.Action> getActionsFromState(State state) {
		List<io.github.mosser.arduinoml.kernel.behavioral.Action> actions = new ArrayList<io.github.mosser.arduinoml.kernel.behavioral.Action>();
		
		for (Action a : state.getActions()) {
			io.github.mosser.arduinoml.kernel.behavioral.Action action = new io.github.mosser.arduinoml.kernel.behavioral.Action();
			action.setActuator(convertSpamlActuatorToMosser(a.actuator));
			if (a.value == SIGNAL.HIGH) {
				action.setValue(io.github.mosser.arduinoml.kernel.structural.SIGNAL.HIGH);
			} else {
				action.setValue(io.github.mosser.arduinoml.kernel.structural.SIGNAL.LOW);
			}
			actions.add(action);
		}
		
		return actions;
	}
	
	private List<io.github.mosser.arduinoml.kernel.behavioral.State> constructStates(Program program) {
		List<io.github.mosser.arduinoml.kernel.behavioral.State> states = new ArrayList<io.github.mosser.arduinoml.kernel.behavioral.State>();
		
		for (State s : program.getStates()) {
			io.github.mosser.arduinoml.kernel.behavioral.State state = new io.github.mosser.arduinoml.kernel.behavioral.State();
			state.setName(s.getName());
			state.setTransitions(getTransitionsFromState(s));
			state.setActions(getActionsFromState(s));
			states.add(state);
		}
		
		return states;
	}
}
