package spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FireballTest {

    private Fireball fireball;

    @Before
    public void setUp() {
        fireball = new Fireball(2, 8);
    }

    @Test
    public void hasSpellSlotCost() {
        assertEquals(2, fireball.getSpellSlotCost());
    }

    @Test
    public void hasDamage() {
        assertEquals(8, fireball.getDamage());
    }

    @Test
    public void canCast() {
        String expected = fireball.cast();
        assertEquals("FIREBALL? ARE YOU CRAZY?", expected);
    }
}