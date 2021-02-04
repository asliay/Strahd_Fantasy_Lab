package players;

import behaviours.ISpell;

public class Wizard extends ArcaneCaster{


    public Wizard(String name, int hitPoints, int spellSlots, ISpell spell) {
        super(name, hitPoints, spellSlots, spell);
    }

    public String cast(){
        ISpell spell = getSpell();
        return spell.cast();
    }

    @Override
    void defend() {

    }
}
