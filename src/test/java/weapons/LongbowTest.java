package weapons;

import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongbowTest {

    private Longbow longbow;
    private Enemy enemy;

    @Before
    public void setUp() {
        longbow = new Longbow();
        enemy = new Hag(20, 8);
    }

    @Test
    public void hasDamage() {
        assertEquals(6, longbow.getMaxDamage());
    }


    @Test
    public void canDamageEnemy() {
        longbow.damage(enemy, 6);
        assertEquals(14, enemy.getHitPoints());
    }
}