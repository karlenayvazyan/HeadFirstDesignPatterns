package am.ak.design.factory.pizza;

import am.ak.design.factory.factory.ingredient.cheese.Cheese;
import am.ak.design.factory.factory.ingredient.clams.Clams;
import am.ak.design.factory.factory.ingredient.dough.Dough;
import am.ak.design.factory.factory.ingredient.pepperoni.Pepperoni;
import am.ak.design.factory.factory.ingredient.sauce.Sauce;
import am.ak.design.factory.factory.ingredient.veggies.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
