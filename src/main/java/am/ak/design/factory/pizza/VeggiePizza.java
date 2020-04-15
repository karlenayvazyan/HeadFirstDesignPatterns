package am.ak.design.factory.pizza;

import am.ak.design.factory.factory.ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {

    }
}
