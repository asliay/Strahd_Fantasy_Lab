package players;

public abstract class Player {

    private String name;
    private int hitPoints;
    private int armourPoints;

    public Player(String name, int hitPoints, int armourPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.armourPoints = armourPoints;
    }
}
