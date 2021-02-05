package players;

import behaviours.ISpell;
import enemies.Enemy;

public class Bard extends Caster {

    public Bard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);

    }

    @Override
    void defend() {

    }
}
