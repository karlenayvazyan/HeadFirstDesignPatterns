package am.ak.design.strategy.group1.duck;

import am.ak.design.strategy.group1.fly.FlyBehavior;
import am.ak.design.strategy.group1.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior ;

    protected QuackBehavior quackBehavior;

    abstract void swim();

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
