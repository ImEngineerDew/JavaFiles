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
      pri[i] = isPrime(primes, i);
      readNumbers(input, pri, sc, i + 1);
    }
  }

  public static void showNumbers(BigInteger input[], boolean pri[], Integer j) {
    if (j < input.length) {
      BigInteger primes = input[j];
      if (pri[j] == true) {
        System.out.println(primes + " is a prime number");
      }
      /** I guess that this space must to put here the method
       * that catches the non-prime number and backwards itself to
       * calculate their prime number
       */
      showNumbers(input, pri, j + 1);
    }
  }

  public static boolean isPrime(BigInteger num, Integer index) {
    Integer numFor = num.intValue();

    if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE) || numFor.equals(4)) {
      return false;
    }
    if (index > (numFor) / 2) {
      if (numFor % index == 0) {
        return false;
      }
    }
    isPrime(num, index + 1);
    return true;
  }
}
