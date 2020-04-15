package am.ak.design.decorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = .12 + beverage.cost();
        if (getSize() == 0) {
            cost += .10;
        } else if (getSize() == 1) {
            cost += .15;
        } else if (getSize() == 2) {
            cost += .20;
        }
        return cost;
    }

    public int getSize() {
        return beverage.getSize();
    }
}
