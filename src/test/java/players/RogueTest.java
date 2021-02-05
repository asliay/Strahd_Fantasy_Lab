package players;

import behaviours.IWeapon;
import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;
import weapons.Shortsword;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RogueTest {

    private Rogue rogue;
    private IWeapon weapon;
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Hag(20, 8);
        weapon = new Shortsword();
        rogue = new Rogue("Snek", 16, weapon);
    }

    @Test
    public void hasName() {
        assertEquals("Snek", rogue.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(16, rogue.getHitPoints());
    }

    @Test
    public void canAttack() {
        rogue.attack(enemy);
        assertTrue(enemy.getHitPoints() < 20);
    }

}
