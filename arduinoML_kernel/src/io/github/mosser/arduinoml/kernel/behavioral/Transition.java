package io.github.mosser.arduinoml.kernel.behavioral;

import java.util.ArrayList;
import java.util.List;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.OPERATION;

public class Transition implements Visitable {
	private List<Condition> conditions;
	private State next;
	private OPERATION operation;	
	
	public OPERATION getOperation() {
		return operation;
	}

	public void setOperation(OPERATION operation) {
		this.operation = operation;
	}

	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		boolean hasTemporal = false;
		for (Condition c : conditions) {
			if (c instanceof TemporalCondition && hasTemporal) {
				throw new RuntimeException("Pas possible d'avoir deux temporal");
			} else if (c instanceof TemporalCondition) {
				hasTemporal = true;
			}
		}
		this.conditions = conditions;
	}
	
	public int getTemporal() {
		for (Condition c : conditions) {
			if (c instanceof TemporalCondition) {
				return ((TemporalCondition) c).getDelay();
			}
		}
		return -1;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
