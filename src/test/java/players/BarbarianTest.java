package players;

import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;

    @Before
    public void setUp() {
        barbarian = new Barbarian("River", 20);
    }

    @Test
    public void hasName() {
        assertEquals("River", barbarian.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(20, barbarian.getHitPoints());
    }
}
