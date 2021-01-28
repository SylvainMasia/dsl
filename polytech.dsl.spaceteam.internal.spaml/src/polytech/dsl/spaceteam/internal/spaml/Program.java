package polytech.dsl.spaceteam.internal.spaml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Program extends NamedElement {
	private List<PluggedElement> pluggedElements = new ArrayList<>();
	private List<State> states = new ArrayList<>();
	private State initialState;
	private static HashMap<String, PluggedElement> declaredPluggedElements = new HashMap<>();

	public static Program create() {
		return new Program();
	}

	public Program addPluggedElement(PluggedElement pluggedElement) {
		this.pluggedElements.add(pluggedElement);
		declaredPluggedElements.put(pluggedElement.getName(), pluggedElement);
		return this;
	}

	public static HashMap<String, PluggedElement> getDeclaredPluggedElements() {
		return declaredPluggedElements;
	}

	public Program addState(State state) {
		this.states.add(state);
		return this;
	}

	public Program setInitialState(State initialState) {
		this.initialState = initialState;
		return this;
	}

	public List<PluggedElement> getPluggedElements() {
		return pluggedElements;
	}

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	@Override
	public Program setName(String name) {
		this.name = name;
		return this;
	}

	public void generateArduinoCode() {
		ConvertToMosserClasses generator = new ConvertToMosserClasses(this);
		System.out.println(generator.generateArduinoCode());
	}
}
