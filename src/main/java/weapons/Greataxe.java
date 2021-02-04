package weapons;

import behaviours.IWeapon;

public class Greataxe extends Weapon {

    public Greataxe(int damage) {
        super(damage);
    }

    @Override
    public String attack() {
        return "You attacked with the Greataxe!";
    }

}
