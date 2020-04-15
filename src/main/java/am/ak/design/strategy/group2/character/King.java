package am.ak.design.strategy.group2.character;

import am.ak.design.strategy.group2.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        super(new SwordBehavior());
    }
}
