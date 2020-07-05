package am.ak.design.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();
    
    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }

    protected String getUserInput() {
        String answer = null;
        System.out.print("Would you like lemon with your tea (y/n)? ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
