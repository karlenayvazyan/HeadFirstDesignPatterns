package am.ak.design.command.remote.command;

import am.ak.design.command.remote.CeilingFan;

public class CeilingFanMediumCommand extends AbstractCeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
}
