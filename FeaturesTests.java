import org.junit.Test;

public class FeaturesTests {

    @Test
    public void testExplode() {
        int result = 0;
        int resultOfARoll = 0;
        while(count > 0) {
            resultOfARoll = DiceRoll.roll(sides);
            result = result + resultOfARoll;
            if (resultOfARoll == sides) {
                count++;
            } else {
                count--;
            }
        }
    }
}
