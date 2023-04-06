import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class piBigDecimalRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer kValue = object.nextInt();
    Integer nValue = object.nextInt();

    BigInteger radio = BigInteger.TEN.pow(kValue);
    BigInteger diameter = radio;

    BigDecimal newRadio = new BigDecimal(radio);
    BigDecimal newDiameter = new BigDecimal(diameter);

    System.out.println(pi(kValue, nValue, newRadio, newDiameter, 1));
  }

  public static BigDecimal pi(int k, int n, BigDecimal rd, BigDecimal dmt, int i) {
    BigDecimal middle = dmt.divide(BigDecimal.valueOf(2));
    BigDecimal newIssue = rd.pow(2).subtract(middle.pow(2));
    BigDecimal root = new BigDecimal(Math.sqrt(newIssue.doubleValue()));
    BigDecimal powMiddle = middle.pow(2);

    if (i == n) {
      System.out.println("Middle value: " + middle);
      System.out.println("newIssue: " + newIssue);
      System.out.println("Square root of newIssue: " + root);
      System.out.println("Pow of middle value: " + powMiddle);
      System.out.println("New diamter: " + dmt);
      return BigDecimal.valueOf(0);
    } else {
      return pi(k, n, rd, dmt, i + 1);
    }
  }
}
