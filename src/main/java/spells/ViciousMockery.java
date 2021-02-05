package spells;

import enemies.Enemy;

public class ViciousMockery extends Spell{

    public ViciousMockery() {
        super(1, 4);
    }

    @Override
    public void damage(Enemy enemy){
        int spellDamage = getDamage();
        enemy.takeDamage(spellDamage);
    }

}
