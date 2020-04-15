package am.ak.design.strategy.group1.duck;

import am.ak.design.strategy.group1.fly.FlyNoWay;
import am.ak.design.strategy.group1.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void swim() {

    }

    public void display() {

    }
}
