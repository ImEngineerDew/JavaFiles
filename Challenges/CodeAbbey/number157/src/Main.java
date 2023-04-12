import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.print("Please write the size of your array: ");
    Integer size = object.nextInt();

    BigInteger inputNumbers[] = new BigInteger[size];
    boolean isPrime[] = new boolean[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Please write the follow numbers: ");
      BigInteger primes = object.nextBigInteger();
      inputNumbers[i] = primes;
      isPrime[i] = isPrime(primes);
    }
    for (int j = 0; j < size; j++) {
      BigInteger number = inputNumbers[j];
      if (isPrime[j] == true) {
        System.out.println(number + " is a prime number");
      } else if (isPrime[j] == false) {
        System.out.println(number + " isn't a prime number");
      }
    }
  }

  public static boolean isPrime(BigInteger num) {
    int numFor = num.intValue();
    if (num == BigInteger.ZERO || num == BigInteger.ONE || num.intValue() == 4) {
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