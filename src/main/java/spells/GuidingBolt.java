package spells;

public class GuidingBolt extends Spell{

    public GuidingBolt() {
        super(1, 6);
    }

    @Override
    public String cast() {
        return "Wow, you cast Guiding Bolt!";
    }

}
