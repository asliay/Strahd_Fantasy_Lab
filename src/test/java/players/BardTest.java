package players;

import behaviours.ISpell;
import org.junit.Before;
import org.junit.Test;
import spells.ViciousMockery;

import static org.junit.Assert.assertEquals;

public class BardTest {

    private Bard bard;
    private ISpell spell;

    @Before
    public void setUp() {
        spell = new ViciousMockery(1,4);
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
        assertEquals("Ouch! You cast Vicious Mockery. That was mean.", bard.cast());
    }
}
