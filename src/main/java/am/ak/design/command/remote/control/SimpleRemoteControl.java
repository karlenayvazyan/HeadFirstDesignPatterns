package am.ak.design.command.remote.control;

import am.ak.design.command.remote.command.Command;

public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

    public void undoWasPressed() {
        slot.undo();
    }
}
