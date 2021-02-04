package weapons;

public class Shortsword extends Weapon{

    public Shortsword() {
        super(6);
    }

    @Override
    public String attack() {
        return "You attacked with the Shortsword!";
    }


}
