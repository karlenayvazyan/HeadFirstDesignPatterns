package am.ak.design.adapter;


import org.junit.jupiter.api.Test;

public class TurkeyAdapterTest {

    @Test
    public void test() {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
