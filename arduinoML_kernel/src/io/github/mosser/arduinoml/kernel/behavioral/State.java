package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.NamedElement;
import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.OPERATION;

import java.util.ArrayList;
import java.util.List;

public class State implements NamedElement, Visitable {

	private String name;
	private List<Action> actions = new ArrayList<Action>();
	private List<Transition> transitions;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(List<Transition> transitions) {
		this.transitions = transitions;
	}
	
	public List<Transition> getTransitionsThatExitTemporal() {
		List<Transition> transitionsToReturn = new ArrayList<>();
		for (Transition t : transitions) {
			if (t.getTemporal() > -1) {
				if (t.getOperation().equals(OPERATION.OR) && t.getConditions().size() > 1) { // case 500 -> off -> the default operator is
					transitionsToReturn.add(t);
				}
			} else {
				transitionsToReturn.add(t);
			}
		}
		return transitionsToReturn;
	}
	
	public List<Transition> getTransitionsAfterTemporal() {
		List<Transition> transitionsToReturn = new ArrayList<>();
		for (Transition t : transitions) {
			if (t.getTemporal() > -1) {
				if (t.getOperation().equals(OPERATION.AND)) {
					transitionsToReturn.add(t);
				} else if(t.getOperation().equals(OPERATION.OR) && t.getConditions().size() == 1 && t.getConditions().get(0) instanceof TemporalCondition) {
					// case if we have
					// LED1 = HIGH
			    	// LED2 = HIGH
			    	// 500 -> off
					transitionsToReturn.add(t);
				}
			}
		}
		return transitionsToReturn;
	}
	
	public int getTemporal() {
		int delay = -1;
		for (Transition t : transitions) {
			int delayTmp = t.getTemporal();
			if (delayTmp > -1 && delay > -1) {
				throw new RuntimeException("Un état ne peut pas avoir deux transitions temporelles");
			} else if(delayTmp > -1) {
				delay = delayTmp;
			}
		}
		return delay;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
