import java.util.Scanner;
import java.math.BigInteger;

public class testingMain {
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
      if (pri[j]) {
        System.out.println(primes + " is a prime number");
      } else {
        BigInteger show = backWards(primes);
        System.out.print(show);
        System.out.println(" ");
      }
      /** I guess that this space must put here the method
       * that catches the non-prime number and backwards itself to
       * calculate their prime number
       *
       * News: I did make the backwards numbers, Now I am going
       * to make an algorithm that verification if these numbers
       * are an eMrip
       */
      showNumbers(input, pri, j + 1);
    }
  }

  public static boolean isPrime(BigInteger num, int index) {
    int numFor = num.intValue();
    int compareIfZero = num.compareTo(BigInteger.ZERO);
    int compareIfOne = num.compareTo(BigInteger.ONE);
    int compareIfFour = num.compareTo(BigInteger.valueOf(4));
    /** This code line must compare between those issues **/
    if (compareIfZero == 0 || compareIfOne == 0 || compareIfFour == 0) {
      return false;
    }
    if (index >= ((numFor) / 2)) {
      return true;
    }
    if (numFor % index == 0) {
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
      System.out.print(number.mod(BigInteger.valueOf(10)));
      return backWards(number.divide(BigInteger.valueOf(10)));
    }
  }
}
