import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
public class RandomBigDecimal
{
    public static void main(String args[])
    {
        Scanner object = new Scanner(System.in);
        BigInteger valueA = object.nextBigInteger();
        BigInteger valueB = object.nextBigInteger();

        BigDecimal decimalA = new BigDecimal(valueA);
        BigDecimal decimalB = new BigDecimal(valueB);

        BigDecimal resultCeiling = decimalA.divide(decimalB,BigDecimal.ROUND_CEILING);
        BigDecimal resulTHalf = decimalA.divide(decimalB,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal resultDown = decimalA.divide(decimalB,BigDecimal.ROUND_DOWN);
        BigDecimal resultFloor = decimalA.divide(decimalB,BigDecimal.ROUND_FLOOR);

        System.out.println("Result with ceiling: "+resultOne);
        System.out.println("Result with half even: "+resultTwo);
        System.out.println("Result with round down: "+resultThree);
        System.out.println("Result with round floor: "+resultFour);



    }

}
