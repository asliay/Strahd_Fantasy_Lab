package spells;

import behaviours.ISpell;
import enemies.Enemy;

public abstract class Spell implements ISpell {

    private int spellSlotCost;
    private int maxDamage;

    public Spell(int spellSlotCost, int maxDamage) {
        this.spellSlotCost = spellSlotCost;
        this.maxDamage = maxDamage;
    }

    public int getSpellSlotCost() {
        return this.spellSlotCost;
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
