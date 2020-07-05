package am.ak.design.template;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping tea through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
}
