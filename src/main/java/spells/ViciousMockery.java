package spells;

public class ViciousMockery extends Spell{

    public ViciousMockery(int spellSlotCost, int damage) {
        super(spellSlotCost, damage);
    }

    @Override
    public String cast() {
        return "Ouch! You cast Vicious Mockery. That was mean.";
    }
}
