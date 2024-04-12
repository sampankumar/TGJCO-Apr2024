public class Features {

    /**
     * @param count
     * @param sides
     * @return
     */
    public int explode(int count, int sides) {
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
        return result;
    }
}
