package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WerewolfTest {

    private Werewolf werewolf;

    @Before
    public void setUp() {
        werewolf = new Werewolf(22);
    }

    @Test
    public void getHitPoints() {
        assertEquals(22, werewolf.getHitPoints());
    }
}