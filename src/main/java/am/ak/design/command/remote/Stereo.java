package am.ak.design.command.remote;

public class Stereo implements ApplianceControl {

    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Stereo is on " + name);
    }

    @Override
    public void of() {
        System.out.println("Stereo is of " + name);
    }

    public void setCd() {
        System.out.println("Stereo set cd " + name);
    }

    public void setDvd() {
        System.out.println("Stereo set dvd " + name);
    }

    public void setRadio() {
        System.out.println("Stereo set radio " + name);
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set volume " + name + " " + volume);
    }
}
