import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class DiceRollTest {
    @Test
    public void testRollWithValidSides() {
        int result = DiceRoll.roll(6);
        assertTrue("Result should be between 1 and " + 6, result >= 1 && result <= 6);
    }
}