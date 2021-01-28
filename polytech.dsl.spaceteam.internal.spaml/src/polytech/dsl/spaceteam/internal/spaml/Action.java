package polytech.dsl.spaceteam.internal.spaml;

public class Action {
	public SIGNAL value = SIGNAL.LOW;
	public Actuator actuator;

	public static Action create() {
		return new Action();
	}

	public SIGNAL getValue() {
		return value;
	}

	public Action setValue(SIGNAL value) {
		this.value = value;
		return this;
	}

	public Actuator getActuator() {
		return actuator;
	}

	public Action setActuator(Actuator actuator) {
		this.actuator = actuator;
		return this;
	}
}
