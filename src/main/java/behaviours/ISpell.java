package behaviours;

import enemies.Enemy;

public interface ISpell {

    void damage(Enemy enemy, int damage);
    int getMaxDamage();
    int getSpellSlotCost();
}
