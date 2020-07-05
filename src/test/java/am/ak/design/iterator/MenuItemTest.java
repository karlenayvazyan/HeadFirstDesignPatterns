package am.ak.design.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

class MenuItemTest {

    @Test
    public void test() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress w = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        w.printMenu();
    }

    private void print(Iterator<MenuItem> breakfastItems) {
        while (breakfastItems.hasNext()) {
            MenuItem menuItem = breakfastItems.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}