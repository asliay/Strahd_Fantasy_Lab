package players;

import java.util.Random;

public abstract class Player {

    private String name;
    private int hitPoints;

    public Player(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void raiseHitPoints(int hitPoints) {
        this.hitPoints += hitPoints;
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int rollDice(int number, int nSides){
        int num = 0;
        Random r = new Random();
        if (nSides >=3) {
            for (int i = 0; i < number; i++) {
                int roll = r.nextInt(nSides) + 1;
                System.out.println("You rolled: " + roll);
                num = num + roll;
            }
        }
        else {
                System.out.println("Error: dice must have more than 3 sides");
        }
        return num;
    }
}
