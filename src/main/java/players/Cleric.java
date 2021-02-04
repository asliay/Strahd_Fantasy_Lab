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

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public IHeal getHealingItem() {
        return this.healingItem;
    }

    public void setHealingItem(IHeal healingItem) {
        this.healingItem = healingItem;
    }

    public void heal(Player player) {
        this.healingItem.heal(player);
    }

    public String cast() {
        ISpell spell = getSpell();
        return spell.cast();
    }
}
