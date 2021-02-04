package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViciousMockeryTest {

    private ViciousMockery viciousMockery;

    @Before
    public void setUp() {
        viciousMockery = new ViciousMockery();
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
    public void canCast() {
        String expected = viciousMockery.cast();
        assertEquals("Ouch! You cast Vicious Mockery. That was mean.", expected);
    }
}