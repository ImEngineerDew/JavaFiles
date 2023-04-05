import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class piRecursive {
    public static void main(String args[]) {
        Scanner object = new Scanner(System.in);

        /** Input values of K and N **/
        int kValue = object.nextInt();
        int nValue = object.nextInt();

        BigInteger radio = BigInteger.TEN.pow(kValue);
        BigInteger diameter = radio;

        /** Space to call the recursive method **/
        System.out.println(pi(kValue, nValue, radio, diameter, 1));
    }

    public static BigInteger pi(int k, int n, BigInteger rd, BigInteger dm, int i) {
        /** Prepare the BigInteger to calculate **/
        BigInteger middle = dm.divide(BigInteger.valueOf(2));
        BigInteger newIssue = rd.pow(2).subtract(middle.pow(2));

        MathContext context = MathContext.UNLIMITED;
        MathContext up = new MathContext(100,RoundingMode.UP);
        MathContext floor = new MathContext(100,RoundingMode.FLOOR);
        MathContext ceil = new MathContext(100,RoundingMode.CEILING);

        BigDecimal root = new BigDecimal(Math.sqrt(newIssue.doubleValue()), context);
        BigDecimal powMiddle = new BigDecimal(Math.pow(middle.doubleValue(), 2), context);

        /** Rounding values **/
        BigDecimal rootUP = new BigDecimal(Math.sqrt(newIssue.doubleValue()),up);
        BigDecimal rootFloor = new BigDecimal (Math.sqrt(newIssue.doubleValue()),floor);
        BigDecimal rootCeil = new BigDecimal (Math.sqrt(newIssue.doubleValue()),ceil);


        /** Convert the BigDecimal's to BigInteger **/
        BigInteger newRoot = root.toBigInteger();
        BigInteger newPowMiddle = powMiddle.toBigInteger();
        dm = newPowMiddle.add(rd.subtract(newRoot).pow(2)).sqrt();

        /** Let's calculate the pi number **/
        BigInteger sixValue = BigInteger.valueOf(6);
        BigInteger divideByTwo = BigInteger.TWO;
        BigInteger productPi = BigInteger.valueOf(2).pow(n);
        BigInteger pi = dm.multiply(sixValue).multiply(productPi).divide(divideByTwo);

        if (i == n) {
            /** This is a depuration code line **/
            System.out.println(" ");
            System.out.println("Middle: "+middle);
            System.out.println("Root unlimited: " + root);
            System.out.println("Root up: "+rootUP);
            System.out.println("Root floor: "+rootFloor);
            System.out.println("Root ceil: "+rootCeil);
            return pi;
        } else {
            return pi(k, n, rd, dm, i + 1);
        }
    }
}
