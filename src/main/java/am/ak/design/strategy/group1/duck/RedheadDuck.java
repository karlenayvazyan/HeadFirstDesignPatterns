package am.ak.design.strategy.group1.duck;

import am.ak.design.strategy.group1.fly.FlyWithWings;
import am.ak.design.strategy.group1.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void swim() {

    }

    public void display() {

    }
}
