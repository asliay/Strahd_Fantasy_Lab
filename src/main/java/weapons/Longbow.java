package weapons;



public class Longbow extends Weapon{

    public Longbow(int damage) {
        super(damage);
    }

    @Override
    public String attack() {
        return "You attacked with the Longbow!";
    }

}
