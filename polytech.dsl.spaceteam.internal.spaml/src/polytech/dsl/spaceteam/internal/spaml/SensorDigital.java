package polytech.dsl.spaceteam.internal.spaml;

public class SensorDigital extends Sensor {
    public static SensorDigital create() {
        return new SensorDigital();
    }

    @Override
    public SensorDigital setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SensorDigital setPin(int pin) {
        this.pin = pin;
        return this;
    }

    public static SensorDigital get(String name) {
        return (SensorDigital) Program.getDeclaredPluggedElements().get(name);
    }
}
