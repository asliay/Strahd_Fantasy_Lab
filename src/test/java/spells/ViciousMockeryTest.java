package spells;

import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViciousMockeryTest {

    private ViciousMockery viciousMockery;
    private Enemy enemy;
    @Before
    public void setUp() {
        viciousMockery = new ViciousMockery();
        enemy = new Hag(20, 8);
    }

    @Test
    public void hasSpellSlotCost() {
        assertEquals(1, viciousMockery.getSpellSlotCost());
    }

    @Test
    public void hasDamage() {
        assertEquals(4, viciousMockery.getDamage());
    }

    @Test
    public void canDamageEnemy() {
        viciousMockery.damage(enemy);
        assertEquals(16, enemy.getHitPoints());
    }
}