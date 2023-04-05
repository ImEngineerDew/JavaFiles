import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.*;

public class testingPiRecursive {
  public static void main(String args[]) {

    /** Set the variables at this scope **/
    Scanner object = new Scanner(System.in);
    Integer kValue = object.nextInt();
    Integer nValue = object.nextInt();

    BigInteger bigRadio = BigInteger.TEN.pow(kValue);
    BigInteger bigDiameter = bigRadio;

    /** Convert a scientific notation in a large number **/
    Double radio = bigRadio.doubleValue();
    DecimalFormat radioFormat = new DecimalFormat("0");
    radioFormat.setMaximumIntegerDigits(1000);

    Double diameter = bigDiameter.doubleValue();
    DecimalFormat diameterFormat = new DecimalFormat("0");
    diameterFormat.setMaximumIntegerDigits(1000);
    System.out.println(pi(kValue,nValue,radio,diameter,1));
  }

  public static String pi(int k, int n, Double rd, Double dm, int i) {
    Double middle = dm/2.0;
    Double newIssue = (Math.pow(rd,2)-Math.pow(middle,2));
    Double root = Math.sqrt(newIssue);
    Double powMiddle = Math.pow(middle,2);

    dm = Math.sqrt(powMiddle+Math.pow((rd-root),2));

    Double productPi = Math.pow(2.0,n);
    Double pi = dm*6*productPi/2.0;

    DecimalFormat rootFormat = new DecimalFormat("0");
    rootFormat.setMaximumIntegerDigits(5);

    DecimalFormat powMiddleFormat = new DecimalFormat("0");
    powMiddleFormat.setMaximumIntegerDigits(5);

    DecimalFormat newDiameterFormat = new DecimalFormat("0");
    newDiameterFormat.setMaximumFractionDigits(5);

    DecimalFormat middleFormat= new DecimalFormat("0");
    middleFormat.setMaximumFractionDigits(5);

    DecimalFormat newIssueFormat = new DecimalFormat("0");
    newIssueFormat.setMaximumFractionDigits(5);

    DecimalFormat piFormat = new DecimalFormat("0");
    piFormat.setMaximumFractionDigits(2);

    if(i == n)
    {
      return piFormat.format(pi);
    }
    return pi(k,n,rd,dm,i+1);
  }
}
