package am.ak.design.command.remote.command;

import am.ak.design.command.remote.CeilingFan;

public abstract class AbstractCeilingFanCommand implements Command {

    protected final CeilingFan ceilingFan;

    protected int prevSpeed;

    protected AbstractCeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
