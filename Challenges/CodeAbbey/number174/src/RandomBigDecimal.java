import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class RandomBigDecimal {
    public static void main(String args[]) {
        Scanner object = new Scanner(System.in);
        //BigInteger valueA = object.nextBigInteger();
        //BigInteger valueB = object.nextBigInteger();

        BigDecimal decimalA = BigDecimal.valueOf(Math.PI).multiply(BigDecimal.valueOf(2));
        BigDecimal decimalB = BigDecimal.valueOf(2);

        BigDecimal resultCeiling = decimalA.divide(decimalB, new MathContext(30, RoundingMode.CEILING));
        BigDecimal resultHalf = decimalA.divide(decimalB, new MathContext(30, RoundingMode.HALF_UP));
        BigDecimal resultDown = decimalA.divide(decimalB, new MathContext(30, RoundingMode.DOWN));
        BigDecimal resultFloor = decimalA.divide(decimalB, new MathContext(30, RoundingMode.FLOOR));
        BigDecimal resultBase32 = decimalA.divide(decimalB, new MathContext(32, RoundingMode.HALF_EVEN));
        BigDecimal resultBase64 = decimalA.divide(decimalB,new MathContext(64,RoundingMode.HALF_EVEN));
        BigDecimal resultBase128 = decimalA.divide(decimalB, new MathContext(128, RoundingMode.HALF_EVEN));
        BigDecimal resultUnlimited = decimalA.divide(decimalB,(MathContext.UNLIMITED));

        BigDecimal multiply32 = resultBase32.multiply(BigDecimal.valueOf(1000000000));
        BigDecimal multiply64 = resultBase64.multiply(BigDecimal.valueOf(1000000000));
        BigDecimal multiply128 = resultBase128.multiply(BigDecimal.valueOf(1000000000));
        BigDecimal multiplyUnlimited = resultUnlimited.multiply(BigDecimal.valueOf(1000000000));

        BigInteger base32 = multiply32.toBigInteger();
        BigInteger base64 = multiply64.toBigInteger();
        BigInteger base128 = multiply128.toBigInteger();
        BigInteger unlimited = multiplyUnlimited.toBigInteger();

        System.out.println("Base 32: " + base32);
        System.out.println("Base 64: "+base64);
        System.out.println("Base 128: " +base128);
        System.out.println("Unlimited: "+unlimited);
    }
}
