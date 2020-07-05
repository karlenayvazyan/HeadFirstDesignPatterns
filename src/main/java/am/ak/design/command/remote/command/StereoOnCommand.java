package am.ak.design.command.remote.command;

import am.ak.design.command.remote.Stereo;

public class StereoOnCommand implements Command {

    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.of();
    }
}
