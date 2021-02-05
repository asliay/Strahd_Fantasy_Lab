package spells;

import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FireballTest {

    private Fireball fireball;
    private Enemy enemy;

    @Before
    public void setUp() {
        fireball = new Fireball();
        enemy = new Hag(20, 8);
    }

    @Test
    public void hasSpellSlotCost() {
        assertEquals(1, fireball.getSpellSlotCost());
    }

    @Test
    public void hasDamage() {
        assertEquals(6, fireball.getDamage());
    }

    @Test
    public void canDamageEnemy() {
        fireball.damage(enemy);
        assertEquals(14, enemy.getHitPoints());
    }
}