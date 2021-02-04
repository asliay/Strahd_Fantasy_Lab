package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuidingBoltTest {

    private GuidingBolt guidingBolt;

    @Before
    public void setUp() {
        guidingBolt = new GuidingBolt(1, 6);
    }

    @Test
    public void hasSpellSlotCost() {
        assertEquals(1, guidingBolt.getSpellSlotCost());
    }

    @Test
    public void hasDamage() {
        assertEquals(6, guidingBolt.getDamage());
    }

    @Test
    public void canCast() {
        String expected = guidingBolt.cast();
        assertEquals("Wow, you cast Guiding Bolt!", expected);
    }
}