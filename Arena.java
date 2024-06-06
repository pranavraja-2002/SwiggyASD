import java.util.Random;

public class Arena {
    private Player playerA;
    private Player playerB;
    private Random random;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

    private int rollDie() {
        return random.nextInt(6) + 1;
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = rollDie();
        int defenseRoll = rollDie();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;

        int damageDealt = Math.max(0, attackDamage - defenseStrength);
        defender.takeDamage(damageDealt);

        System.out.printf("%s attacks (roll: %d) -> %s defends (roll: %d) -> Damage dealt: %d -> %s health: %d\n",
                attacker, attackRoll, defender, defenseRoll, damageDealt, defender, defender.getHealth());
    }

    public void startBattle() {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() < playerB.getHealth()) {
                takeTurn(playerA, playerB);
                if (playerB.isAlive()) {
                    takeTurn(playerB, playerA);
                }
            } else {
                takeTurn(playerB, playerA);
                if (playerA.isAlive()) {
                    takeTurn(playerA, playerB);
                }
            }
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }

    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        arena.startBattle();
    }
}
