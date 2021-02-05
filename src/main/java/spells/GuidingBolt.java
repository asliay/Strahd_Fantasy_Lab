package spells;

import enemies.Enemy;

public class GuidingBolt extends Spell{

    public GuidingBolt() {
        super(1, 6);
    }

    @Override
    public void damage(Enemy enemy){
        int spellDamage = getDamage();
        enemy.takeDamage(spellDamage);
    }

}
