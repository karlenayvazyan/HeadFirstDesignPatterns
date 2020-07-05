package am.ak.design.command.remote.command;

import am.ak.design.command.remote.Hottub;

public class HottubOffCommand implements Command {

    private final Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.jetsOn();
    }
}
