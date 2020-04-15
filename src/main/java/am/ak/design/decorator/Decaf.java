package am.ak.design.decorator;

public class Decaf extends Beverage {
    public Decaf() {
        description = "dark roast";
    }

    @Override
    public double cost() {
        return 2.44;
    }
}
