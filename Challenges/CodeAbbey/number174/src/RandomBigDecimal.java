import java.math.MathContext;
import java.math.RoundingMode;
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

        BigDecimal resultCeiling = decimalA.divide(decimalB, new MathContext(20, RoundingMode.CEILING));
        BigDecimal resultHalf = decimalA.divide(decimalB,new MathContext(20,RoundingMode.HALF_UP));
        BigDecimal resultDown = decimalA.divide(decimalB, new MathContext(20,RoundingMode.DOWN));
        BigDecimal resultFloor = decimalA.divide(decimalB,BigDecimal.ROUND_FLOOR);

        System.out.println("Result with ceiling: "+resultCeiling);
        System.out.println("Result with half even: "+resultHalf);
        System.out.println("Result with round down: "+resultDown);
        System.out.println("Result with round floor: "+resultFloor);



    }

}
