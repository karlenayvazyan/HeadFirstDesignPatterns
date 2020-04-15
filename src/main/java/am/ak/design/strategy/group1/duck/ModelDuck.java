package am.ak.design.strategy.group1.duck;

import am.ak.design.strategy.group1.fly.FlyNoWay;
import am.ak.design.strategy.group1.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void swim() {

    }

    @Override
    void display() {
        System.out.println("I’m a model duck");
    }
}
