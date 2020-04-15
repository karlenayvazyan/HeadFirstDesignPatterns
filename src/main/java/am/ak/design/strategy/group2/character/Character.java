package am.ak.design.strategy.group2.character;

import am.ak.design.strategy.group2.weapon.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
