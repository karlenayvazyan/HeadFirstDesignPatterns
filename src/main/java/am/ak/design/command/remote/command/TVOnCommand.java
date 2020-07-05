package am.ak.design.command.remote.command;

import am.ak.design.command.remote.TV;

public class TVOnCommand implements Command {

    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.of();
    }
}
