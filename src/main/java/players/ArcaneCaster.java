package players;

public abstract class ArcaneCaster extends Player{

    private int spellSlots;

    public ArcaneCaster(String name, int hitPoints, int spellSlots) {
        super(name, hitPoints);
        this.spellSlots = spellSlots;
    }

    public int getSpellSlots() {
        return spellSlots;
    }

    abstract void defend();
}
