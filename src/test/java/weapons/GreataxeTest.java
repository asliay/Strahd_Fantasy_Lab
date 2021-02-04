package weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreataxeTest {

    private Greataxe greataxe;

    @Before
    public void setUp() {
        greataxe = new Greataxe();
    }

    @Test
    public void hasDamage() {
        assertEquals(8, greataxe.getDamage());
    }

    @Test
    public void canChangeDamage() {
        greataxe.setDamage(10);
        assertEquals(10, greataxe.getDamage());
    }

    @Test
    public void attack() {
        String expected = greataxe.attack();
        assertEquals("You attacked with the Greataxe!", expected);
    }
}