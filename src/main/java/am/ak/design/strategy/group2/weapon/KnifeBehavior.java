package am.ak.design.strategy.group2.weapon;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("KnifeBehavior");
    }
}
