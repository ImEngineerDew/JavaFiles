import java.math.*;

public class Main {
  public static void main(String args[]) {
    int kValue = 63;
    int nValue = 33;

    BigInteger radio = BigInteger.TEN.pow(kValue);
    BigInteger diameter = radio;

    for (Integer i = 1; i <=nValue; i++) {
      BigInteger middlePoint = diameter.divide(BigInteger.valueOf(2));
      BigInteger newIssue = radio.pow(2).subtract(middlePoint.pow(2));

      BigDecimal root = new BigDecimal(Math.sqrt(newIssue.doubleValue()));
      BigDecimal powMiddle = new BigDecimal(Math.pow(middlePoint.doubleValue(),2));



      /**
      diameter = Math.sqrt(powMiddle + (Math.pow((radio-root),2)));

      double pi = diameter*6*Math.pow(2,i/2);
      */
      System.out.println(i+" "+root+" "+powMiddle);
    }
  }
}