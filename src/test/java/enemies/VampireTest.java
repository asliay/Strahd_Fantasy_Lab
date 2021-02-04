package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VampireTest {

    private Vampire vampire;

    @Before
    public void setUp() {
        vampire = new Vampire(20);
    }

    @Test
    public void getHitPoints() {
        assertEquals(20, vampire.getHitPoints());
    }



}