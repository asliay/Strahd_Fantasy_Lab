package healing;

import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.Rogue;
import players.Wizard;
import weapons.Shortsword;

import static org.junit.Assert.*;

public class HealingWordTest {

    private Player player;
    private HealingWord healingWord;
    private IWeapon weapon;

    @Before
    public void setUp() {
        weapon = new Shortsword();
        player = new Rogue("Snek", 12, weapon);
        healingWord = new HealingWord();
    }

    @Test
    public void hasHealPoints() {
        assertEquals(4, healingWord.getHealPoints());
    }

    @Test
    public void canHeal() {
        healingWord.heal(player);
        assertEquals(16, player.getHitPoints());
    }
}