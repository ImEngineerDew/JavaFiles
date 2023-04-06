import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
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

        BigInteger root = newIssue.sqrt();
        BigInteger powMiddle = middle.pow(2);

        dm = powMiddle.add(rd.subtract(root).pow(2)).sqrt();

        /** Let's calculate the pi number **/
        BigInteger sixValue = BigInteger.valueOf(6);
        BigInteger divideByTwo = BigInteger.TWO;
        BigInteger productPi = BigInteger.valueOf(2).pow(n);
        BigInteger pi = dm.multiply(sixValue).multiply(productPi).divide(divideByTwo);

        if (i == n) {
            return pi;
        } else {
            return pi(k, n, rd, dm, i + 1);
        }
    }
}
