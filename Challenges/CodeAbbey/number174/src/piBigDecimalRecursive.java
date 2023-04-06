import java.math.BigDecimal;
import java.util.Scanner;

public class piBigDecimalRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer kValue = object.nextInt();
    Integer nValue = object.nextInt();

    BigDecimal radio = BigDecimal.TEN.pow(kValue);
    BigDecimal diameter = radio;

    System.out.println(pi(kValue,nValue,radio,diameter,1));
  }

  public static BigDecimal pi(int k, int n, BigDecimal rd, BigDecimal dmt, int i) {
    BigDecimal middle = dmt.divide(BigDecimal.valueOf(2));
    BigDecimal newIssue = rd.pow(2).subtract(middle.pow(2));

    System.out.println("Middle value: "+middle);
    System.out.println("newIssue: "+newIssue);
    return BigDecimal.valueOf(0);

  }

}
