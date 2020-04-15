package am.ak.design.strategy.group1.duck;

import am.ak.design.strategy.group1.fly.FlyWithWings;
import am.ak.design.strategy.group1.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void swim() {

    }

    public void display() {

    }
}
