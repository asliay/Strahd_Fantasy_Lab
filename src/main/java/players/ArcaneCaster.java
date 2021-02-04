package players;

public abstract class ArcaneCaster extends Player{

    private int spellSlots;

    public ArcaneCaster(String name, int hitPoints, int armourPoints, int spellSlots) {
        super(name, hitPoints, armourPoints);
        this.spellSlots = spellSlots;
    }

    abstract void defend();
}
