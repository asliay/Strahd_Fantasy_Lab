package spells;

public class Fireball extends Spell{

    public Fireball() {
        super(1, 6);
    }

    @Override
    public String cast() {
        return "FIREBALL? ARE YOU CRAZY?";
    }

}
