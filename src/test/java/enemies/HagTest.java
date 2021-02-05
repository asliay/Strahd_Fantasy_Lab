package enemies;

import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Player;
import weapons.Greataxe;

import static org.junit.Assert.assertEquals;

public class HagTest {

    private Hag hag;
    private Player player;
    private IWeapon weapon;

    @Before
    public void setUp() {
        hag = new Hag(25, 8);
        weapon = new Greataxe();
        player = new Barbarian("River", 20, weapon);
    }

    @Test
    public void hasHitPoints() {
        assertEquals(25, hag.getHitPoints());
    }

    @Test
    public void canAttack() {
        hag.attack(player);
        assertEquals(12, player.getHitPoints());
    }
}