package players;

import behaviours.ISpell;

public class Wizard extends ArcaneCaster{


    public Wizard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);
    }

    @Override
    void defend() {

    }
}
