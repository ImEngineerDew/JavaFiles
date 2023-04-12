import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.print("Please write the size of your array: ");
    Integer size = object.nextInt();

    boolean isPrime[] = new boolean[size];

    for (int i = 0; i < isPrime.length; i++) {
      System.out.print("Please write the follow numbers: ");
      BigInteger primes = object.nextBigInteger();
      isPrime[i] = isPrime(primes);

      if (isPrime[i] == true) {
        System.out.println(primes + " is a prime number");
      } else if (isPrime[i] == false) {
        System.out.println(primes + " isn't a prime number");
      }
    }
  }
  public static boolean isPrime(BigInteger num) {
    int numFor = num.intValue();
    if (num == BigInteger.ZERO || num == BigInteger.ONE || num == BigInteger.valueOf(4)) {
      return false;
    }
    for (int i = 2; i < numFor / 2; i++) {
      if (numFor % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int eMirpNum(BigInteger number) {
    return 0;
  }
}