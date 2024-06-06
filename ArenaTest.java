import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArenaTest {
    private Player playerA;
    private Player playerB;
    private Arena arena;

    @Before
    public void setUp() {
        playerA = new Player(50, 5, 10);
        playerB = new Player(100, 10, 5);
        arena = new Arena(playerA, playerB);
    }

    @Test
    public void testBattle() {
        arena.startBattle();
        assertTrue(!playerA.isAlive() || !playerB.isAlive());
    }
}
