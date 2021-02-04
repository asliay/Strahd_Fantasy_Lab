package healing;

import behaviours.IHeal;
import players.Player;

public class HealingWord implements IHeal {

    private int healPoints;

    public HealingWord(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void heal(Player player) {
        player.healPlayer(getHealPoints());
    }

}
