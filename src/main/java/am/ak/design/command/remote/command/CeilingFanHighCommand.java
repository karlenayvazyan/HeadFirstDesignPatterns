package am.ak.design.command.remote.command;

import am.ak.design.command.remote.CeilingFan;

public class CeilingFanHighCommand extends AbstractCeilingFanCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }
}
