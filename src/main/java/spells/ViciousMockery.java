package spells;

public class ViciousMockery extends Spell{

    public ViciousMockery() {
        super(1, 4);
    }

    @Override
    public String cast() {
        return "Ouch! You cast Vicious Mockery. That was mean.";
    }

}
