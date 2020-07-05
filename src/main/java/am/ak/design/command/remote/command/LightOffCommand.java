package am.ak.design.command.remote.command;

import am.ak.design.command.remote.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.of();
    }

    @Override
    public void undo() {
        light.on();
    }
}
