package players;

public abstract class MartialClass extends Player {

    public MartialClass(String name, int hitPoints, int armourPoints) {
        super(name, hitPoints, armourPoints);
    }

    abstract void attack();
}
