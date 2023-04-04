import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
public class piRecursive{
  public static void main(String args[])
  {
      Scanner object = new Scanner(System.in);

      int kValue = object.nextInt();
      int nValue = object.nextInt();

      int index = 0;

      BigInteger radio = BigInteger.valueOf(10).pow(kValue);
      BigInteger diameter = radio;

      /** That issue can print the pi **/
      recursivePi(nValue, diameter,index+1);

  }
  public static void recursivePi(int nValue, BigInteger diameter,int index)
  {
      /** Lets's check that the diameter value is the same of radio taken before **/
      BigInteger radio = diameter;

      /** The conditiona if works properly at this recursion **/
      if(index>nValue)
      {
        return;
      }
      BigInteger middle = diameter.divide(BigInteger.valueOf(2));
      BigInteger newIssue = radio.pow(2).subtract(middle.pow(2));

      BigDecimal sqRoot = new BigDecimal(Math.sqrt(newIssue.doubleValue()));
      BigDecimal powMiddle =  new BigDecimal(Math.pow(middle.doubleValue(),2));

      BigInteger sqRootInt = sqRoot.toBigInteger();
      BigInteger sqPowMid  = powMiddle.toBigInteger();

      System.out.println(index+": "+sqRoot+" "+powMiddle);
      recursivePi(nValue, diameter,index+1);
  }
}
