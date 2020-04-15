package am.ak.design.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "dark roast";
    }

    @Override
    public double cost() {
        return 1.76;
    }
}
