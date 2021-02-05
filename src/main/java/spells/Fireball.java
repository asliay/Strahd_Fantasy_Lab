package spells;

import enemies.Enemy;

public class Fireball extends Spell{

    public Fireball() {
        super(1, 6);
    }

    @Override
    public void damage(Enemy enemy){
        int spellDamage = getDamage();
        enemy.takeDamage(spellDamage);
    }

}
