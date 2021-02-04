package players;

import behaviours.IHeal;
import behaviours.ISpell;

public class Cleric extends Player {

    private int spellSlots;
    private ISpell spell;
    private IHeal healingItem;

    public Cleric(String name, int hitPoints, int spellSlots, ISpell spell, IHeal healingItem) {
        super(name, hitPoints);
        this.spellSlots = spellSlots;
        this.spell = spell;
        this.healingItem = healingItem;
    }

    public int getSpellSlots() {
        return spellSlots;
    }

    public ISpell getSpell() {
        return this.spell;
    }

    public IHeal getHealingItem() {
        return this.healingItem;
    }
}
