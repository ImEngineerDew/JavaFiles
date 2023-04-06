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

    BigDecimal secondData = rd.subtract(root);                /** Like radio-root **/
    BigDecimal powSecondData = secondData.pow(2);          /** Like (radio-root)² **/
    BigDecimal sumPowMiddle = powMiddle.add(powSecondData);   /** Like powMiddle+ (radio-root)² **/

    if(i == n)
    {
      System.out.println("Middle value: " + middle);
      System.out.println("newIssue: " + newIssue);
      System.out.println("Square root of newIssue: " + root);
      System.out.println("Pow of middle value: "+powMiddle);
      return BigDecimal.valueOf(0);
    }
    else
    {
      return pi(k,n,rd,dmt,i+1);
    }

  }

}
