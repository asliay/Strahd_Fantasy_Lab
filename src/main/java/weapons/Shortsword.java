package weapons;

import behaviours.IWeapon;

public class Shortsword implements IWeapon {

    private int damage;

    public Shortsword() {
        this.damage = 6;
    }

    @Override
    public String attack() {
        return "You attacked with the Shortsword!";
    }

    @Override
    public int getDamage() {
        return this.damage;
    }


}
