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

    System.out.println("Radio like BigInteger: " + bigRadio);
    System.out.println("Radio like Double: " + radioFormat.format(radio));
    System.out.println("Diameter like Double: "+diameterFormat.format(diameter));
    System.out.println(pi(kValue,nValue,radio,diameter,1));
  }

  public static Integer pi(int k, int n, Double rd, Double dm, int i) {
    Double middle = dm/2.0;
    Double newIssue = (Math.pow(rd,2)-Math.pow(dm,2));

    DecimalFormat middleFormat= new DecimalFormat("0");
    middleFormat.setMaximumIntegerDigits(1000);

    if(i == n)
    {
      System.out.println("Middle: "+middleFormat.format(middle));
      System.out.println("New Issue: "+newIssue);
      return 0;
    }
    return pi(k,n,rd,dm,i+1);
  }
}
