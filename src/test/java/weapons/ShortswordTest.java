package weapons;

import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortswordTest {

    private Shortsword shortsword;
    private Enemy enemy;

    @Before
    public void setUp() {
        shortsword = new Shortsword();
        enemy = new Hag(20, 8);
    }

    @Test
    public void hasDamage() {
        assertEquals(6, shortsword.getMaxDamage());
    }

    @Test
    public void canDamageEnemy() {
        shortsword.damage(enemy, 6);
        assertEquals(14, enemy.getHitPoints());
    }
}