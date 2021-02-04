package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortswordTest {

    private Shortsword shortsword;

    @Before
    public void setUp() {
        shortsword = new Shortsword(4);
    }

    @Test
    public void hasDamage() {
        assertEquals(4, shortsword.getDamage());
    }

    @Test
    public void canChangeDamage() {
        shortsword.setDamage(10);
        assertEquals(10, shortsword.getDamage());
    }

    @Test
    public void attack() {
        String expected = shortsword.attack();
        assertEquals("You attacked with the Shortsword!", expected);
    }
}