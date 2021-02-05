package spells;

import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuidingBoltTest {

    private GuidingBolt guidingBolt;
    private Enemy enemy;

    @Before
    public void setUp() {
        guidingBolt = new GuidingBolt();
        enemy = new Hag(20, 8);
    }

    @Test
    public void hasSpellSlotCost() {
        assertEquals(1, guidingBolt.getSpellSlotCost());
    }

    @Test
    public void hasDamage() {
        assertEquals(6, guidingBolt.getMaxDamage());
    }

    @Test
    public void canDamageEnemy() {
        guidingBolt.damage(enemy, 6);
        assertEquals(14, enemy.getHitPoints());
    }
}