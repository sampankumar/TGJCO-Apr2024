import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceRollTest {
    @Test
    public void testRollWithValidSides2() {
        int result = DiceRoll.roll(2);
        assertTrue("Result should be between 1 and " + 2, result >= 1 && result <= 2);
    }
    @Test
    public void testRollWithValidSides3() {
        int result = DiceRoll.roll(3);
        assertTrue("Result should be between 1 and " + 3, result >= 1 && result <= 3);
    }

    @Test
    public void testRollWithValidSides4() {
        int result = DiceRoll.roll(4);
        assertTrue("Result should be between 1 and " + 4, result >= 1 && result <= 4);
    }

    @Test
    public void testRollWithValidSides6() {
        int result = DiceRoll.roll(6);
        assertTrue("Result should be between 1 and " + 6, result >= 1 && result <= 6);
    }

    @Test
    public void testRollWithValidSides8() {
        int result = DiceRoll.roll(8);
        assertTrue("Result should be between 1 and " + 8, result >= 1 && result <= 8);
    }
    @Test
    public void testRollWithValidSides10() {
        int result = DiceRoll.roll(10);
        assertTrue("Result should be between 1 and " + 10, result >= 1 && result <= 10);
    }

    @Test
    public void testRollWithValidSides12() {
        int result = DiceRoll.roll(12);
        assertTrue("Result should be between 1 and " + 12, result >= 1 && result <= 12);
    }

    @Test
    public void testRollWithValidSides20() {
        int result = DiceRoll.roll(20);
        assertTrue("Result should be between 1 and " + 8, result >= 1 && result <= 20);
    }

    @Test
    public void testRollWithValidSides100() {
        int result = DiceRoll.roll(100);
        assertTrue("Result should be between 1 and " + 100, result >= 1 && result <= 100);
    }
}