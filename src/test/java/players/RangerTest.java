package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangerTest {

    private Ranger ranger;

    @Before
    public void setUp() {
        ranger = new Ranger("Page", 17);
    }

    @Test
    public void hasName() {
        assertEquals("Page", ranger.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(17, ranger.getHitPoints());
    }
}
