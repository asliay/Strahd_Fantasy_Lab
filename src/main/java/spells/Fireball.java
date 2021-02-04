package spells;

public class Fireball extends Spell{

    public Fireball(int spellSlotCost, int damage) {
        super(spellSlotCost, damage);
    }

    @Override
    public String cast() {
        return "FIREBALL? ARE YOU CRAZY?";
    }

}
