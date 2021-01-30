package polytech.dsl.spaceteam.internal.spaml;

public class LogicalCondition extends Condition{
	public SIGNAL value = SIGNAL.LOW;
	public Sensor sensor;

	public static LogicalCondition create() {
		return new LogicalCondition();
	}

	public SIGNAL getValue() {
		return value;
	}

	public LogicalCondition setValue(SIGNAL value) {
		this.value = value;
		return this;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public LogicalCondition setSensor(String sensor) {
		this.sensor = Sensor.get(sensor);
		return this;
	}
}
