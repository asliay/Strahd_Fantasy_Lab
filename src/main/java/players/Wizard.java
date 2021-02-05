package players;

import behaviours.ISpell;
import enemies.Enemy;

public class Wizard extends Caster {


    public Wizard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);
    }

    public void cast(Enemy enemy){
        ISpell spell = getSpell();
        spell.damage(enemy);
        int spellCost = spell.getSpellSlotCost();
        setSpellSlots(spellCost);
    }

    @Override
    void defend() {

    }
}
