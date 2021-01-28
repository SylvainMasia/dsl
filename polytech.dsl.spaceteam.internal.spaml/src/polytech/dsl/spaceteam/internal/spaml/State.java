package polytech.dsl.spaceteam.internal.spaml;

import java.util.ArrayList;
import java.util.List;

public class State extends NamedElement {
	private List<Transition> transitions = new ArrayList<>();
	private List<Action> actions = new ArrayList<>();

	public static State create(){
		return new State();
	}

	public State addTransition(Transition t){
		transitions.add(t);
		return this;
	}

	public State addAction(Action a){
		actions.add(a);
		return this;
	}

	public List<Action> getActions() {
		return actions;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	@Override
	public State setName(String name) {
		this.name = name;
		return this;
	}
}
