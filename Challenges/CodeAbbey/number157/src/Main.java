import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.println("Please write the size of your array: ");
    Integer size = object.nextInt();

    System.out.println("Please write the follow numbers: ");
    BigInteger primes = object.nextBigInteger();

    boolean isPrime[] = new boolean[size];

    for (int i = 0; i < isPrime.length; i++) {
      isPrime[i] = isPrime(primes);
    }
    System.out.println(isPrime.toString());
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