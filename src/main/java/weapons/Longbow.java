package weapons;


import behaviours.IWeapon;
import enemies.Enemy;

public class Longbow implements IWeapon {

    private int damage;

    public Longbow() {
        this.damage = 6;
    }

    @Override
    public void damage(Enemy enemy){
        int damage = getDamage();
        enemy.takeDamage(damage);
    }

    @Override
    public int getDamage() {
        return this.damage;
    }


}
