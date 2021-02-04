package healing;

import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.Rogue;
import weapons.Shortsword;

import static org.junit.Assert.*;

public class PotionTest {

    private Player player;
    private Potion potion;
    private IWeapon weapon;

    @Before
    public void setUp() {
        weapon = new Shortsword();
        player = new Rogue("Snek", 12, weapon);
        potion = new Potion();
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