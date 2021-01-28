package polytech.dsl.spaceteam.internal.spaml;

public abstract class PluggedElement extends NamedElement {
	public int pin;

	public int getPin() {
		return pin;
	}

	public abstract PluggedElement setPin(int pin);
}
