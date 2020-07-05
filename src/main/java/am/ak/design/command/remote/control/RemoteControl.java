package am.ak.design.command.remote.control;

import am.ak.design.command.remote.command.Command;

public class RemoteControl extends RemoteControlBase {

    public RemoteControl() {
        super();
    }

    @Override
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    @Override
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    @Override
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
