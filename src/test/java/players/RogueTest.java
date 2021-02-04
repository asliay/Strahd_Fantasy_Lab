package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RogueTest {

    private Rogue rogue;

    @Before
    public void setUp() {
        rogue = new Rogue("Snek", 16);
    }

    @Test
    public void hasName() {
        assertEquals("Snek", rogue.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(16, rogue.getHitPoints());
    }

}
