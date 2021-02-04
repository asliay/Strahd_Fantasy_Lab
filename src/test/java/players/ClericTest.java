package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;

    @Before
    public void setUp() {
        cleric = new Cleric("Eg", 18, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Eg", cleric.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(18, cleric.getHitPoints());
    }

    @Test
    public void hasSpellSlots() {
        assertEquals(5, cleric.getSpellSlots());
    }
}

