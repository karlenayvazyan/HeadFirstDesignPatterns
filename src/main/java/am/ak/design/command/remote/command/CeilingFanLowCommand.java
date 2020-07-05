package am.ak.design.command.remote.command;

import am.ak.design.command.remote.CeilingFan;

public class CeilingFanLowCommand extends AbstractCeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
