package players;

public class Cleric extends Player{

    private int spellSlots;

    public Cleric(String name, int hitPoints, int spellSlots) {
        super(name, hitPoints);
        this.spellSlots = spellSlots;
    }

    public int getSpellSlots() {
        return spellSlots;
    }
}
