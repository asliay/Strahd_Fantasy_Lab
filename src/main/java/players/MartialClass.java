package players;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class MartialClass extends Player {

    private IWeapon weapon;

    public MartialClass(String name, int hitPoints, IWeapon weapon) {
        super(name, hitPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        int damage = weapon.getDamage();
        enemy.takeDamage(damage);
    }
}
