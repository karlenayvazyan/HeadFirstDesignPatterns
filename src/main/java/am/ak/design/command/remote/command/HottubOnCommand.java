package am.ak.design.command.remote.command;

import am.ak.design.command.remote.Hottub;

public class HottubOnCommand implements Command {

    private final Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
}
