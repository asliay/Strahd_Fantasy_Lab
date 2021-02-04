package players;

public class Cleric extends Player{

    private int spellSlots;

    public Cleric(String name, int hitPoints, int armourPoints, int spellSlots) {
        super(name, hitPoints, armourPoints);
        this.spellSlots = spellSlots;
    }
}
