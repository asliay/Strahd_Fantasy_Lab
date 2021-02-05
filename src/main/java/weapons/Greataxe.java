package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Greataxe implements IWeapon {

    private int damage;

    public Greataxe() {
        this.damage = 8;
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
