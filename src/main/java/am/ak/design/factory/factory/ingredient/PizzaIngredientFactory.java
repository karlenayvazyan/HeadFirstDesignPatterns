package am.ak.design.factory.factory.ingredient;

import am.ak.design.factory.factory.ingredient.cheese.Cheese;
import am.ak.design.factory.factory.ingredient.clams.Clams;
import am.ak.design.factory.factory.ingredient.dough.Dough;
import am.ak.design.factory.factory.ingredient.pepperoni.Pepperoni;
import am.ak.design.factory.factory.ingredient.sauce.Sauce;
import am.ak.design.factory.factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
