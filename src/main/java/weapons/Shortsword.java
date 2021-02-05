package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Shortsword implements IWeapon {

    private int damage;

    public Shortsword() {
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
