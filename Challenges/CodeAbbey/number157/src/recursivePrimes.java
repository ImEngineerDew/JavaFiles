import java.util.Scanner;
import java.math.BigInteger;

public class recursivePrimes {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);

    System.out.print("Please write the size of your array: ");
    Integer size = object.nextInt();

    BigInteger input[] = new BigInteger[size];
    boolean numberPrime[] = new boolean[size];
    readNumbers(input, numberPrime, object, 0);
    showNumbers(input, numberPrime, 0);
  }

  public static void readNumbers(BigInteger input[], boolean pri[], Scanner sc, Integer i) {
    if (!i.equals(input.length)) {
      BigInteger primes = sc.nextBigInteger();
      input[i] = primes;
      pri[i] = isPrime(primes, 2);
      readNumbers(input, pri, sc, i + 1);
    }
  }

  public static void showNumbers(BigInteger input[], boolean pri[], Integer j) {
    int compareJtoInput = j.compareTo(input.length);
    /** j<input.length **/
    if (compareJtoInput == -1) {
      BigInteger primes = input[j];
      BigInteger oMirp = backWards(primes);
      boolean isOmrip = isPrime(oMirp, 2) && isPrime(primes,2);
      //System.out.println(primes.toString() + " ");
      if (isOmrip) {
        System.out.println(oMirp.toString()+" is a prime of: "+primes.toString());
      } else {
        System.out.println(primes.toString()+" doesn't have an oMirp");
      }
      showNumbers(input, pri, j + 1);
    }
  }

  public static boolean isPrime(BigInteger num, int index) {
    /** List of variables that compare both values **/
    int numFor = num.intValue();
    int compareIfZero = num.compareTo(BigInteger.ZERO);
    int compareIfOne = num.compareTo(BigInteger.ONE);
    int compareIfFour = num.compareTo(BigInteger.valueOf(4));
    BigInteger modules = num.mod(BigInteger.valueOf(index));

    int compareModule = modules.compareTo(BigInteger.ZERO);

    /** This code line must compare between those issues **/
    if (compareIfZero == 0 || compareIfOne == 0 || compareIfFour == 0) {
      return false;
    }
    if (index >= ((numFor) / 2)) {
      return true;
    }
    if (compareModule == 0) {
      return false;
    }
    return isPrime(num, index + 1);
  }

  public static BigInteger backWards(BigInteger number) {
    int firstCompare = number.compareTo(BigInteger.valueOf(10));
    /**Check if the number is minus than 10**/
    if (firstCompare == -1) {
      return number;
      /**If the number is greater than 10, then flip the number **/
    } else {
      String reversedString = "";
      BigInteger reversedNumber;
      reversedString = reversedString.concat(number.mod(BigInteger.valueOf(10)).toString());
      reversedNumber = backWards(number.divide(BigInteger.valueOf(10)));
      reversedString = reversedString.concat(reversedNumber.toString());
      return new BigInteger(reversedString);
    }
  }
}