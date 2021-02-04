package healing;

import behaviours.IHeal;
import players.Player;

public class Potion implements IHeal {

    private int healPoints;

    public Potion() {
        this.healPoints = 3;
    }

    public int getHealPoints() {
        return this.healPoints;
    }

    @Override
    public void heal(Player player) {
        int playerHealth = player.getHitPoints();
        int newHealth = playerHealth + getHealPoints();
        player.setHitPoints(newHealth);
    }
}
