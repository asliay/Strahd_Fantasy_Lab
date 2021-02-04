package players;

import behaviours.ISpell;
import spells.ViciousMockery;

public class Bard extends ArcaneCaster{

    private ViciousMockery viciousMockery;

    public Bard(String name, int hitPoints, int spellSlots) {
        super(name, hitPoints, spellSlots);
    }

    @Override
    void defend() {

    }
}
