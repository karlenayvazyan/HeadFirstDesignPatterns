package am.ak.design.strategy.group2.character;

import am.ak.design.strategy.group2.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        super(new AxeBehavior());
    }
}
