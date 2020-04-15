package am.ak.design.factory.store;

import am.ak.design.factory.factory.ingredient.NYPizzaIngredientFactory;
import am.ak.design.factory.factory.ingredient.PizzaIngredientFactory;
import am.ak.design.factory.pizza.*;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(factory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(factory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(factory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(factory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            default:
                throw new IllegalArgumentException();
        }
        return pizza;
    }
}
