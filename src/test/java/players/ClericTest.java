package players;

import behaviours.IHeal;
import behaviours.ISpell;
import behaviours.IWeapon;
import healing.HealingWord;
import healing.Potion;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.GuidingBolt;
import weapons.Shortsword;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Rogue player;
    private Cleric cleric;
    private ISpell spell;
    private IHeal healingItem;
    private IWeapon weapon;

    @Before
    public void setUp() {
        spell = new GuidingBolt(1,6);
        healingItem = new Potion();
        weapon = new Shortsword();
        player = new Rogue("Snek", 12, weapon);
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
    public void canChangeSpell() {
        ISpell newSpell = new Fireball();
        cleric.setSpell(newSpell);
        assertEquals(newSpell, cleric.getSpell());
    }

    @Test
    public void hasHealingItem() {
        assertEquals(healingItem, cleric.getHealingItem());
    }

    @Test
    public void canChangeHealingItem() {
        IHeal newItem = new HealingWord();
        cleric.setHealingItem(newItem);
        assertEquals(newItem, cleric.getHealingItem());
    }

    @Test
    public void canHeal() {
        cleric.heal(player);
        assertEquals(15, player.getHitPoints());
    }

    @Test
    public void canCast() {
        assertEquals("Wow, you cast Guiding Bolt!", cleric.cast());
    }
}

