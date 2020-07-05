package am.ak.design.command.remote;

public class GarageDoor {

    private final String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("garage door is up " + name);
    }

    public void down() {
        System.out.println("garage door is down " + name);
    }
//
//    void stop();
//
//    void lightOn();
//
//    void lightOff();
}
