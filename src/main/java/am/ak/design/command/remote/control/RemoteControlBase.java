package am.ak.design.command.remote.control;

import am.ak.design.command.remote.command.Command;
import am.ak.design.command.remote.command.NoCommand;

public abstract class RemoteControlBase {

    protected final Command[] onCommands;
    protected final Command[] offCommands;
    protected final Command noCommand = new NoCommand();

    public RemoteControlBase() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    abstract void setCommand(int slot, Command onCommand, Command offCommand);

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------Remote Control------ -\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append(" ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuff.toString();
    }

    public abstract void onButtonWasPushed(int slot);

    public abstract void offButtonWasPushed(int slot);
}
