import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class DiceRollTest {
    @Test
    public void testRollWithValidSides() {
        for (int sides : DiceRoll.VALID_SIDES) {
            int result = DiceRoll.roll(sides);
            assertTrue("Result should be between 1 and " + sides, result >= 1 && result <= sides);
        }
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRollWithInvalidSides() {
        // Test rolling with invalid sides
        int invalidSide = 5;
        DiceRoll.roll(invalidSide);
    }
}