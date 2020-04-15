package am.ak.design.factory.pizza;

import am.ak.design.factory.factory.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }
}
