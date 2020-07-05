package am.ak.design.command.remote.command;

import am.ak.design.command.remote.Stereo;

public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.of();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
