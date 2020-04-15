package am.ak.design.strategy.group2.character;

import am.ak.design.strategy.group2.weapon.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        super(new BowAndArrowBehavior());
    }
}
