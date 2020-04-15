package am.ak.design.factory;

import am.ak.design.factory.pizza.Pizza;
import am.ak.design.factory.store.ChicagoStylePizzaStore;
import am.ak.design.factory.store.NYStylePizzaStore;
import am.ak.design.factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore(); 
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
