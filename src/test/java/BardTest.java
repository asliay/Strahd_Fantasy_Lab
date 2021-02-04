import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Bard;

import static org.junit.Assert.assertEquals;

public class BardTest {

    private Bard bard;

    @Before
    public void setUp() {
        bard = new Bard("Eight", 16, 5);
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
}
