import java.math.BigDecimal;
import java.util.Scanner;

public class piBigDecimalRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer kValue = object.nextInt();
    Integer nValue = object.nextInt();

    BigDecimal radio = BigDecimal.TEN.pow(kValue);
    BigDecimal diameter = radio;

    System.out.println(pi(kValue, nValue, radio, diameter, 1));
  }

  public static BigDecimal pi(int k, int n, BigDecimal rd, BigDecimal dmt, int i) {
    BigDecimal middle = dmt.divide(BigDecimal.valueOf(2));
    BigDecimal newIssue = rd.pow(2).subtract(middle.pow(2));
    BigDecimal root = new BigDecimal(Math.sqrt(newIssue.doubleValue()));
    BigDecimal powMiddle = middle.pow(2);

    Double radio = rd.doubleValue();
    Double middleDouble = middle.doubleValue();
    Double newIssueDouble = newIssue.doubleValue();
    Double rootDouble = root.doubleValue();
    Double powDouble = powMiddle.doubleValue();


    if(i == n)
    {
      System.out.println("Middle value: " + middleDouble);
      System.out.println("newIssue: " + newIssueDouble);
      System.out.println("Square root of newIssue: " + rootDouble);
      System.out.println("Pow of middle value: "+powDouble);
      System.out.println("New diamter: "+dmt);
      return BigDecimal.ZERO;
    }
    else
    {
      return pi(k,n,rd,dmt,i+1);
    }

  }

}
