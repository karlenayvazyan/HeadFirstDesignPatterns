package am.ak.design.command.remote.command;

import am.ak.design.command.remote.GarageDoor;

public class GarageDoorUpCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
