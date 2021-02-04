package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HagTest {

    private Hag hag;

    @Before
    public void setUp() {
        hag = new Hag(25);
    }

    @Test
    public void hasHitPoints() {
        assertEquals(25, hag.getHitPoints());
    }
}