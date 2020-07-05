package am.ak.design.command.remote.command;

import am.ak.design.command.remote.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
