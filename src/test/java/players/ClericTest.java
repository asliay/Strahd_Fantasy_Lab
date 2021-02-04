package players;

import behaviours.IHeal;
import behaviours.ISpell;
import healing.Potion;
import org.junit.Before;
import org.junit.Test;
import spells.GuidingBolt;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private ISpell spell;
    private IHeal healingItem;

    @Before
    public void setUp() {
        spell = new GuidingBolt(1,6);
        healingItem = new Potion();
        cleric = new Cleric("Eg", 18, 5, spell, healingItem);
    }

    @Test
    public void hasName() {
        assertEquals("Eg", cleric.getName());
    }

    @Test
    public void hasHitPoints() {
        assertEquals(18, cleric.getHitPoints());
    }

    @Test
    public void hasSpellSlots() {
        assertEquals(5, cleric.getSpellSlots());
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, cleric.getSpell());
    }

    @Test
    public void hasHealingItem() {
        assertEquals(healingItem, cleric.getHealingItem());
    }
}

