package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Weapon implements IWeapon {

    private int maxDamage;

    public Weapon(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    @Override
    public void damage(Enemy enemy, int damage){
        enemy.takeDamage(damage);
    }

    @Override
    public int getMaxDamage() {
        return this.maxDamage;
    }
}
