package weapons;

import behaviours.IWeapon;

public abstract class Weapon implements IWeapon {

    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
