import java.util.Random;

public class DiceRoll {
    static final int[] VALID_SIDES = {2, 3, 4, 6, 8, 10, 12, 20, 100};
    private static Random random;
    // Static method to roll a die with a specified number of sides
    public static int roll(int sides) {
        // Implement dice rolling logic
        if (isValidSide(sides)) {
            return random.nextInt(sides) + 1;
        } else {
            throw new IllegalArgumentException("Invalid dice side: " + sides);
        }
    }
    private static boolean isValidSide(int sides) {
        for (int validSide : VALID_SIDES) {
            if (validSide == sides) {
                return true;
            }
        }
        return false;
    }
}