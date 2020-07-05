package am.ak.design.command.remote.command;

import am.ak.design.command.remote.CeilingFan;

public class CeilingFanOffCommand extends AbstractCeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }
}
