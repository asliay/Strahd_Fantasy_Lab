package players;

import behaviours.ISpell;
import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;
import spells.ViciousMockery;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BardTest {

    private Bard bard;
    private ISpell spell;
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Hag(20, 8);
        spell = new ViciousMockery();
        bard = new Bard("Eight", 16, 5, spell);
    }

    @Test
    public void hasName() {
        assertEquals("Eight", bard.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(16, bard.getHitPoints());
    }

    @Test
    public void hasSpellSlots() {
        assertEquals(5, bard.getSpellSlots());
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, bard.getSpell());
    }

    @Test
    public void canCast() {
        bard.cast(enemy);
        assertTrue(enemy.getHitPoints() < 20);
    }
}
