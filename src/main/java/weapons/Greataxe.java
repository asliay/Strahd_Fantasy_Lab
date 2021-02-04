package weapons;

import behaviours.IWeapon;

public class Greataxe implements IWeapon {

    private int damage;

    public Greataxe() {
        this.damage = 6;
    }

    @Override
    public String attack() {
        return "You attacked with the Greataxe!";
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

}
