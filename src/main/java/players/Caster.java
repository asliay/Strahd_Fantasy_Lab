package players;

import behaviours.ISpell;

public abstract class Caster extends Player{

    private int spellSlots;
    private ISpell spell;

    public Caster(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints);
        this.spellSlots = spellSlots;
        this.spell = spell;
    }

    public int getSpellSlots() {
        return this.spellSlots;
    }

    public void setSpellSlots(int spellSlots) {
        this.spellSlots -= spellSlots;
    }

    public ISpell getSpell() {
        return this.spell;
    }

    public void changeSpell(ISpell spell) {
        this.spell = spell;
    }

    abstract void defend();
}
