package players;

import behaviours.IWeapon;
import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;
import weapons.Longbow;

import static org.junit.Assert.assertEquals;

public class RangerTest {

    private Ranger ranger;
    private Enemy enemy;
    private IWeapon weapon;

    @Before
    public void setUp() {
        weapon = new Longbow();
        enemy = new Hag(20);
        ranger = new Ranger("Page", 17, weapon);
    }

    @Test
    public void hasName() {
        assertEquals("Page", ranger.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(17, ranger.getHitPoints());
    }

    @Test
    public void canAttack() {
        ranger.attack(enemy);
        assertEquals(14, enemy.getHitPoints());
    }
}
