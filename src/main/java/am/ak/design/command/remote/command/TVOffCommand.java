package am.ak.design.command.remote.command;

import am.ak.design.command.remote.TV;

public class TVOffCommand implements Command {

    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.of();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
