package polytech.dsl.spaceteam.internal.spaml;

public class TemporalCondition extends Condition {
	public int delay = 0;

	public static TemporalCondition create() {
		return new TemporalCondition();
	}

	public int getDelay() {
		return delay;
	}

	public TemporalCondition setDelay(int delay) {
		this.delay = delay;
		return this;
	}
}
