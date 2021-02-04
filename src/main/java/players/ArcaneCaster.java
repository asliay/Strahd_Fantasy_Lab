package players;

import behaviours.ISpell;

public abstract class ArcaneCaster extends Player{

    private int spellSlots;
    private ISpell spell;

    public ArcaneCaster(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints);
        this.spellSlots = spellSlots;
        this.spell = spell;
    }

    public int getSpellSlots() {
        return this.spellSlots;
    }

    public ISpell getSpell() {
        return this.spell;
    }

    abstract void defend();
}
