package am.ak.design.command.remote;

public class TV implements ApplianceControl {

    private final String name;

    public TV(String name) {
        this.name = name;
    }

    @Override
    public void on() {

    }

    @Override
    public void of() {

    }

    public void setInputChannel() {
    }

    public void setVolume() {
    }
}
