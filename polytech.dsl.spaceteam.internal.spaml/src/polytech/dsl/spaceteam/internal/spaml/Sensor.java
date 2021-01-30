package polytech.dsl.spaceteam.internal.spaml;

public abstract class Sensor extends PluggedElement {
    public static Sensor get(String name) {
        return (Sensor) Program.getDeclaredPluggedElements().get(name);
    }
}
