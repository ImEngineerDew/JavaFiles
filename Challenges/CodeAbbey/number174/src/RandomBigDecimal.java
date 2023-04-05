import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class RandomBigDecimal {
    public static void main(String args[]) {
        Scanner object = new Scanner(System.in);
        BigInteger valueA = object.nextBigInteger();
        BigInteger valueB = object.nextBigInteger();

        BigDecimal decimalA = new BigDecimal(valueA);
        BigDecimal decimalB = new BigDecimal(valueB);

        BigDecimal resultCeiling = decimalA.divide(decimalB, new MathContext(30, RoundingMode.CEILING));
        BigDecimal resultHalf = decimalA.divide(decimalB, new MathContext(30, RoundingMode.HALF_UP));
        BigDecimal resultDown = decimalA.divide(decimalB, new MathContext(30, RoundingMode.DOWN));
        BigDecimal resultFloor = decimalA.divide(decimalB, new MathContext(30, RoundingMode.FLOOR));
        BigDecimal resultBase32 = decimalA.divide(decimalB, new MathContext(32, RoundingMode.HALF_EVEN));
        BigDecimal resultBase128 = decimalA.divide(decimalB, new MathContext(128, RoundingMode.HALF_EVEN));

        System.out.println("ceiling: " + resultCeiling);
        System.out.println("Half up: " + resultHalf);
        System.out.println("round down: " + resultDown);
        System.out.println("round floor: " + resultFloor);
        System.out.println("Base 32: " + resultBase32);
        System.out.println("Base 128: " + resultBase128);
    }
}
