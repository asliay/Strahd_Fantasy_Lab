package healing;

import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.Rogue;

import static org.junit.Assert.*;

public class PotionTest {

    private Player player;
    private Potion potion;

    @Before
    public void setUp() {
        player = new Rogue("Snek", 12);
        potion = new Potion(3);
    }

    @Test
    public void hasHealPoints() {
        assertEquals(3, potion.getHealPoints());
    }

    @Test
    public void canHeal() {
        potion.heal(player);
        assertEquals(15, player.getHitPoints());
    }
}