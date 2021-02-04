package players;

import behaviours.ISpell;
import enemies.Enemy;

public class Wizard extends ArcaneCaster{


    public Wizard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);
    }


    public void cast(Enemy enemy){
        ISpell spell = getSpell();
        int spellDamage = spell.getDamage();
        enemy.takeDamage(spellDamage);
        setSpellSlots(spell.getSpellSlotCost());

    }

    @Override
    void defend() {

    }
}
