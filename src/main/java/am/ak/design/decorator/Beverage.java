package am.ak.design.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    int size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
