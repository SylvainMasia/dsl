package polytech.dsl.spaceteam.internal.spaml;

public class Actuator extends PluggedElement {
    public static Actuator create() {
        return new Actuator();
    }

    @Override
    public Actuator setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Actuator setPin(int pin) {
        this.pin = pin;
        return this;
    }

    public static Actuator get(String name) {
        return (Actuator) Program.getDeclaredPluggedElements().get(name);
    }
}
