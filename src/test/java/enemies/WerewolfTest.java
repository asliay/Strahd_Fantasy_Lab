package enemies;

import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Player;
import weapons.Greataxe;

import static org.junit.Assert.assertEquals;

public class WerewolfTest {

    private Werewolf werewolf;
    private IWeapon weapon;
    private Player player;

    @Before
    public void setUp() {
        werewolf = new Werewolf(22, 8);
        weapon = new Greataxe();
        player = new Barbarian("River", 20, weapon);
    }

    @Test
    public void getHitPoints() {
        assertEquals(22, werewolf.getHitPoints());
    }

    @Test
    public void canAttack() {
        werewolf.attack(player);
        assertEquals(12, player.getHitPoints());
    }
}