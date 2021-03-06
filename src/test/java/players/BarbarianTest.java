package players;

import behaviours.IWeapon;
import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;
import weapons.Greataxe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BarbarianTest {

    private Barbarian barbarian;
    private IWeapon weapon;
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Hag(20, 8);
        weapon = new Greataxe();
        barbarian = new Barbarian("River", 20, weapon);
    }

    @Test
    public void hasName() {
        assertEquals("River", barbarian.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(20, barbarian.getHitPoints());
    }

    @Test
    public void canAttack() {
        barbarian.attack(enemy);
        assertTrue(enemy.getHitPoints() < 20);
    }

    @Test
    public void canRage() {
        assertEquals("You've flown into a rage!", barbarian.rage());
    }
}
