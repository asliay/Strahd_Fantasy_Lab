package spells;

import behaviours.ISpell;

public abstract class Spell implements ISpell {

    private int spellSlotCost;
    private int damage;

    public Spell(int spellSlotCost, int damage) {
        this.spellSlotCost = spellSlotCost;
        this.damage = damage;
    }

    public int getSpellSlotCost() {
        return this.spellSlotCost;
    }

    public int getDamage() {
        return this.damage;
    }
}
