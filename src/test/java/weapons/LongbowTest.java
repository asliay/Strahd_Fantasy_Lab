package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongbowTest {

    private Longbow longbow;

    @Before
    public void setUp() {
        longbow = new Longbow();
    }

    @Test
    public void hasDamage() {
        assertEquals(6, longbow.getDamage());
    }

    @Test
    public void canChangeDamage() {
        longbow.setDamage(10);
        assertEquals(10, longbow.getDamage());
    }

    @Test
    public void attack() {
        String expected = longbow.attack();
        assertEquals("You attacked with the Longbow!", expected);
    }
}