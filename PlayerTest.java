import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player(100, 10, 20);
    }

    @Test
    public void testInitialHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testTakeDamage() {
        player.takeDamage(30);
        assertEquals(70, player.getHealth());
    }

    @Test
    public void testTakeFatalDamage() {
        player.takeDamage(120);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.takeDamage(120);
        assertFalse(player.isAlive());
    }
}
