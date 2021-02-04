package weapons;

public class Shortsword extends Weapon{

    public Shortsword(int damage) {
        super(damage);
    }

    @Override
    public String attack() {
        return "You attacked with the Shortsword!";
    }


}
