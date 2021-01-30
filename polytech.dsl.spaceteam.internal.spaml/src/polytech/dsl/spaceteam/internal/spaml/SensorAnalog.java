package polytech.dsl.spaceteam.internal.spaml;

public class SensorAnalog extends Sensor {
    public static SensorAnalog create() {
        return new SensorAnalog();
    }

    @Override
    public SensorAnalog setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SensorAnalog setPin(int pin) {
        this.pin = pin;
        return this;
    }
}
