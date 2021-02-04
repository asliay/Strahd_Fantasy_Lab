package healing;

import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.Rogue;
import players.Wizard;

import static org.junit.Assert.*;

public class HealingWordTest {

    private Player player;
    private HealingWord healingWord;

    @Before
    public void setUp() {
        player = new Rogue("Snek", 12);
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