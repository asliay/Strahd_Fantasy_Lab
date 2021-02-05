package behaviours;

import enemies.Enemy;

public interface IWeapon {

    void damage(Enemy enemy);
    int getDamage();
}
