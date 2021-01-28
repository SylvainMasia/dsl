package polytech.dsl.spaceteam.internal.spaml;

public abstract class NamedElement {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract NamedElement setName(String name);
}
