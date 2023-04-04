import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);

    int kValue = object.nextInt();
    int nValue = object.nextInt();

    BigInteger radio = BigInteger.TEN.pow(kValue);
    BigInteger diameter = radio;
    BigInteger pi = BigInteger.ZERO;

    Integer i;

    for (i = 1; i <= nValue; i++) {
      /** Prepare the BigInteger to calculate **/
      BigInteger middle = diameter.divide(BigInteger.valueOf(2));
      BigInteger newIssue = radio.pow(2).subtract(middle.pow(2));

      BigDecimal root = new BigDecimal(Math.sqrt(newIssue.doubleValue()));
      BigDecimal powMiddle = new BigDecimal(Math.pow(middle.doubleValue(), 2));

      /** Convert the BigDecimal's to BigInteger **/
      BigInteger newRoot = root.toBigInteger();
      BigInteger newPowMiddle = powMiddle.toBigInteger();
      diameter = newPowMiddle.add(radio.subtract(newRoot).pow(2)).sqrt();

      /** Let's calculate the pi number **/
      BigInteger sixValue = BigInteger.valueOf(6);
      BigInteger divideByTwo = BigInteger.TWO;
      BigInteger productPi = BigInteger.valueOf(2).pow(nValue);
      pi = diameter.multiply(sixValue).multiply(productPi).divide(divideByTwo);
    }
    System.out.println(pi);
  }
}