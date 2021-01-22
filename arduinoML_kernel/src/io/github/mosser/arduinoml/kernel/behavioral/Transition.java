package io.github.mosser.arduinoml.kernel.behavioral;

import java.util.List;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.OPERATION;

public class Transition implements Visitable {

	private List<TransitionHandler> handlers;
	private State next;
	private OPERATION operation;
	private int delay = 0;
	
	
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

	public List<TransitionHandler> getHandlers() {
		return handlers;
	}

	public void setHandlers(List<TransitionHandler> handlers) {
		this.handlers = handlers;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
