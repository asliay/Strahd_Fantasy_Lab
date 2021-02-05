package players;

import behaviours.ISpell;
import enemies.Enemy;

public class Wizard extends Caster {


    public Wizard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);
    }

    @Override
    void defend() {

    }
}
