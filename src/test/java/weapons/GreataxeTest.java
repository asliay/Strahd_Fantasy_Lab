package weapons;

import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreataxeTest {

    private Greataxe greataxe;
    private Enemy enemy;

    @Before
    public void setUp() {
        greataxe = new Greataxe();
        enemy = new Hag(20, 8);
    }

    @Test
    public void hasDamage() {
        assertEquals(8, greataxe.getMaxDamage());
    }


    @Test
    public void canDamageEnemy() {
        greataxe.damage(enemy, 8);
        assertEquals(12, enemy.getHitPoints());
    }
}