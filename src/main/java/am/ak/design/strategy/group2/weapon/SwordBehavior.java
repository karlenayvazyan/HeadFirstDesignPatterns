package am.ak.design.strategy.group2.weapon;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("SwordBehavior");
    }
}
