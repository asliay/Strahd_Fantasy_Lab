package spells;

public class GuidingBolt extends Spell{

    public GuidingBolt(int spellSlotCost, int damage) {
        super(spellSlotCost, damage);
    }

    @Override
    public String cast() {
        return "Wow, you cast Guiding Bolt!";
    }

}
