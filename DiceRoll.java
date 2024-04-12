import java.util.Random;

public class DiceRoll {
    private static Random random;
    // Static method to roll a die with a specified number of sides
    public static int roll(int sides) {
        // Implement dice rolling logic
        return random.nextInt(sides) + 1;
    }
}