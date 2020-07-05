package am.ak.design.command.remote;

public class Light implements ApplianceControl {

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Light is on " + name);
    }

    @Override
    public void of() {
        System.out.println("Light is of " + name);
    }
}
