package am.ak.design.command.remote.control;

import am.ak.design.command.remote.command.Command;
import am.ak.design.command.remote.command.NoCommand;

public class RemoteControlWithUndo extends RemoteControlBase {

    private Command undoCommand;

    public RemoteControlWithUndo() {
        super();
        undoCommand = noCommand;
    }

    @Override
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    @Override
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    @Override
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
