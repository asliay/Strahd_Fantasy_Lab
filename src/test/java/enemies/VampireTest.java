package enemies;

import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Player;
import weapons.Greataxe;

import static org.junit.Assert.*;

public class VampireTest {

    private Vampire vampire;
    private IWeapon weapon;
    private Player player;

    @Before
    public void setUp() {
        vampire = new Vampire(20, 6);
        weapon = new Greataxe();
        player = new Barbarian("River", 20, weapon);
    }

    @Test
    public void getHitPoints() {
        assertEquals(20, vampire.getHitPoints());
    }

    @Test
    public void canAttack() {
        vampire.attack(player);
        assertEquals(14, player.getHitPoints());
    }

}