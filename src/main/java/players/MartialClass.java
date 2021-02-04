package players;

public abstract class MartialClass extends Player {

    public MartialClass(String name, int hitPoints) {
        super(name, hitPoints);
    }


    abstract void attack();
}
