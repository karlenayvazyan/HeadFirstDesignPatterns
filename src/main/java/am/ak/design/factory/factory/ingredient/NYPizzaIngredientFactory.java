package am.ak.design.factory.factory.ingredient;

import am.ak.design.factory.factory.ingredient.cheese.Cheese;
import am.ak.design.factory.factory.ingredient.cheese.ReggianoCheese;
import am.ak.design.factory.factory.ingredient.clams.Clams;
import am.ak.design.factory.factory.ingredient.clams.FreshClams;
import am.ak.design.factory.factory.ingredient.dough.Dough;
import am.ak.design.factory.factory.ingredient.dough.ThinCrustDough;
import am.ak.design.factory.factory.ingredient.pepperoni.Pepperoni;
import am.ak.design.factory.factory.ingredient.pepperoni.SlicedPepperoni;
import am.ak.design.factory.factory.ingredient.sauce.MarinaraSauce;
import am.ak.design.factory.factory.ingredient.sauce.Sauce;
import am.ak.design.factory.factory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
