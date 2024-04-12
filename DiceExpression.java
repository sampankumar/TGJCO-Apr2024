import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DiceExpression {
    private String expression;

    private Set<Integer> validDiceSet=new HashSet<>(Arrays.asList(2,3, 4, 6, 8, 10, 12, 20, 100));

    private Set<Character> validOp=new HashSet<>(Arrays.asList('+','-','*'));

    public DiceExpression(String expression) {
        this.expression = expression.trim(); // Trim the input string
    }

    public void evaluate() {

        for(Character ch:expression.toCharArray())
        {
            if(validOp.contains(ch))
            {
               // String chlist+=ch;
            }
        }

        String[] expressionParts = expression.split("[+\\-*]");


        float res = 0;
        for (int i = 0; i < expressionParts.length; i++) {
            if (expressionParts[i].contains("d"))
                res += evaluateParts(expressionParts[i]);
        }
    }


    public int evaluateParts(String exp)
    {
        String diceRoll[]= expression.split("d");

        int timesDiceRolled=0;
        int diceNumbered=0;
        int rollout=0;
        if (diceRoll.length== 1) {
            timesDiceRolled=1;
            diceNumbered = Integer.valueOf(diceRoll[0]);

        }
        else {
            timesDiceRolled = Integer.valueOf(diceRoll[0]);
            diceNumbered = Integer.valueOf(diceRoll[1]);
        }

        if (timesDiceRolled <= 0 || diceNumbered <= 0) {
            System.out.println("Invalid input. Both the number of dice and the number of sides must be positive integers.");
            return 0;
        }
        if(checkValidDice(diceNumbered))
        {
            //No of Times diced rolled
            for(int i=0;i<timesDiceRolled;i++) {
                rollout+=DiceRoll.roll(diceNumbered);
            }
        }
        else
        {
            System.out.println("Its INVALID Dice Number.");
            return 0;
        }
        return rollout;

    }

    boolean checkValidDice(int diceNumbered)
    {
        if(validDiceSet.contains(diceNumbered))
        {
            return true;
        }
        return false;
    }
}