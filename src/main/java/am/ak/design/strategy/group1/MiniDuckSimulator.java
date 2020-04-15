package am.ak.design.strategy.group1;

import am.ak.design.strategy.group1.duck.Duck;
import am.ak.design.strategy.group1.duck.MallardDuck;
import am.ak.design.strategy.group1.duck.ModelDuck;
import am.ak.design.strategy.group1.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
