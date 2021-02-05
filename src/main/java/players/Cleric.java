package players;

import behaviours.IHeal;
import behaviours.ISpell;
import enemies.Enemy;

public class Cleric extends Caster {

    private IHeal healingItem;

    public Cleric(String name, int hitPoints, int spellSlots, ISpell spell, IHeal healingItem) {
        super(name, hitPoints,spellSlots, spell);
        this.healingItem = healingItem;
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

    @Override
    void defend() {

    }
}
