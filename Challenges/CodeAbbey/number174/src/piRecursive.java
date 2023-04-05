import java.math.MathContext;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

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

        BigDecimal root = new BigDecimal(Math.sqrt(newIssue.doubleValue()), MathContext.DECIMAL128);
        BigDecimal powMiddle = new BigDecimal(Math.pow(middle.doubleValue(), 2),MathContext.DECIMAL128);

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
            return pi;
        } else {
            System.out.println("Root: "+root);
            System.out.println("PowMiddle: "+powMiddle);
            return pi(k, n, rd, dm, i + 1);
        }
    }
}
