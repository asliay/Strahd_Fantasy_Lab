package players;

import behaviours.ISpell;
import enemies.Enemy;
import enemies.Hag;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private ISpell spell;
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Hag(20, 8);
        spell = new Fireball();
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

    @Test
    public void canCast() {
        wizard.cast(enemy);
        assertEquals(14, enemy.getHitPoints());
        assertEquals(4, wizard.getSpellSlots());
    }
}
