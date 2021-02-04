package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;

    @Before
    public void setUp() {
        wizard = new Wizard("Kazamir", 13, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Kazamir", wizard.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(13, wizard.getHitPoints());
    }

    @Test
    public void hasSpellSlots() {
        assertEquals(5, wizard.getSpellSlots());
    }

}
