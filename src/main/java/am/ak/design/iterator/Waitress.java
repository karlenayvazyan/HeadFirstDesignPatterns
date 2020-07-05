package am.ak.design.iterator;

import java.util.Iterator;

public class Waitress {
    private final Menu<MenuItem> pancakeHouseMenu;
    private final Menu<MenuItem> dinerMenu;
    private final Menu<MenuItem> cafeMenu;

    public Waitress(Menu<MenuItem> pancakeHouseMenu, Menu<MenuItem> dinerMenu, Menu<MenuItem> cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> breakfastItems) {
        while (breakfastItems.hasNext()) {
            MenuItem menuItem = breakfastItems.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
