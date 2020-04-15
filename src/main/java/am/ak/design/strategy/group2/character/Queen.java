package am.ak.design.strategy.group2.character;

import am.ak.design.strategy.group2.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        super(new KnifeBehavior());
    }
}
