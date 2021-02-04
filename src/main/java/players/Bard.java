package players;

import behaviours.ISpell;
import spells.ViciousMockery;

public class Bard extends ArcaneCaster{

    public Bard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);

    }

    @Override
    void defend() {

    }
}
