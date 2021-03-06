package healing;

import behaviours.IHeal;
import players.Player;

public class HealingWord implements IHeal {

    private int healPoints;

    public HealingWord() {
        this.healPoints = 4;
    }

    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void heal(Player player) {
        player.raiseHitPoints(healPoints);
    }



}
