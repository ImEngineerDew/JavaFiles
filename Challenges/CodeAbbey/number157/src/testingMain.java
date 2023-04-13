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
    if (j < input.length) {
      BigInteger primes = input[j];
      if (pri[j]) {
        System.out.println(primes + " is a prime number");
      }
      /** I guess that this space must put here the method
       * that catches the non-prime number and backwards itself to
       * calculate their prime number
       */
      showNumbers(input, pri, j + 1);
    }
  }

  public static boolean isPrime(BigInteger num, int index) {
    int numFor = num.intValue();

    if (num == BigInteger.ZERO || num == BigInteger.ONE || num.intValue() == 4) {
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
}