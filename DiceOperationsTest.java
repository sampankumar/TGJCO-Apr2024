import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiceOperationsTest {

    @Test
    public void testAdd() {
        int operand1 = 5;
        int operand2 = 3;
        int result = DiceOperations.add(operand1, operand2);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int operand1 = 10;
        int operand2 = 4;
        int result = DiceOperations.subtract(operand1, operand2);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int operand1 = 7;
        int operand2 = 2;
        int result = DiceOperations.multiply(operand1, operand2);
        assertEquals(14, result);
    }
}