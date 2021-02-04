package healing;

import behaviours.IHeal;
import players.Player;

public class Potion implements IHeal {

    private int healPoints;

    public Potion(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return this.healPoints;
    }

    @Override
    public void heal(Player player) {
        player.healPlayer(healPoints);
    }
}
