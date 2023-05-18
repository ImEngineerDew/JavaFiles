package baseCodes;
import java.math.BigInteger;
import java.util.Scanner;

public class backwardsBigInt {
  public static void main(String[] args) {

    Scanner object = new Scanner (System.in);
    /** Put their original BigInteger **/
    BigInteger number = object.nextBigInteger();

    /** Convert this BigInteger into String **/
    String bigString = number.toString();

    /** Apply the backwards method **/
    String backwards = backwardsString(bigString);

    System.out.println("Original number: " + number);
    System.out.println("Backwards number: " + backwards);
  }

  public static String backwardsString(String number) {
    StringBuilder backwards = new StringBuilder();

    for (int i = number.length() - 1; i >= 0; i--) {
      backwards.append(number.charAt(i));
    }
    return backwards.toString();
  }
}
