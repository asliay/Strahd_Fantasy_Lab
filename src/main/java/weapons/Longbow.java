package weapons;



public class Longbow extends Weapon{

    public Longbow() {
        super(6);
    }

    @Override
    public String attack() {
        return "You attacked with the Longbow!";
    }

}
