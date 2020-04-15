package am.ak.design.strategy.group1.duck;

import am.ak.design.strategy.group1.fly.FlyWithWings;
import am.ak.design.strategy.group1.quack.MuteQuack;

public class Batik extends Duck {

    public Batik() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    void swim() {

    }

    @Override
    void display() {

    }
}
