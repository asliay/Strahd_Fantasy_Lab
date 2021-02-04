package players;

import behaviours.ISpell;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private ISpell spell;

    @Before
    public void setUp() {
        spell = new Fireball(2, 8);
        wizard = new Wizard("Kazamir", 13, 5, spell);
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

    @Test
    public void hasSpell() {
        assertEquals(spell, wizard.getSpell());
    }
}
