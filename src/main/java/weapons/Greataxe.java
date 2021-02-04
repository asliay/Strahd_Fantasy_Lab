package weapons;

import behaviours.IWeapon;

public class Greataxe extends Weapon {

    public Greataxe() {
        super(8);
    }

    @Override
    public String attack() {
        return "You attacked with the Greataxe!";
    }

}
