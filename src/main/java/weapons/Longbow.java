package weapons;


import behaviours.IWeapon;

public class Longbow implements IWeapon {

    private int damage;

    public Longbow() {
        this.damage = 6;
    }

    @Override
    public String attack() {
        return "You attacked with the Longbow!";
    }

    @Override
    public int getDamage() {
        return this.damage;
    }


}
