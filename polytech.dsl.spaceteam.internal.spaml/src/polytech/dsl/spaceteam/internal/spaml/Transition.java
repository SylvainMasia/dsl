package polytech.dsl.spaceteam.internal.spaml;

import java.util.ArrayList;
import java.util.List;

public class Transition {
	private List<Condition> conditions = new ArrayList<>();
	private OPERATION operation = OPERATION.OR;
	private State next;

	public static Transition create() {
		return new Transition();
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public OPERATION getOperation() {
		return operation;
	}

	public Transition setOperation(OPERATION operation) {
		this.operation = operation;
		return this;
	}

	public State getNext() {
		return next;
	}

	public Transition addCondition(Condition c) {
		this.conditions.add(c);
		return this;
	}

	public Transition setNext(String next) {
		this.next = State.create().setName(next);
		return this;
	}
}
