import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.print("Please write the size of your array: ");
    Integer size = object.nextInt();

    BigInteger inputNumbers[] = new BigInteger[size];
    boolean numPrime[] = new boolean[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Please write the follow numbers: ");
      BigInteger primes = object.nextBigInteger();
      inputNumbers[i] = primes;
      numPrime[i] = isPrime(primes);
    }
    for (int j = 0; j < size; j++) {
      BigInteger primes = inputNumbers[j];
      if (numPrime[j] == true || eMirpNum(primes) == true) {
        System.out.println(primes + " is a prime number and eMrip too");
      } else if (numPrime[j] == true || eMirpNum(primes) == false) {
        System.out.println(primes + " is a prime number and isn't an eMrip");
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

  //This is a code stub that backwards their number prior to calculate if this number is prime or not
  public static boolean eMirpNum(BigInteger number) {
    int n = number.intValue();
    if (isPrime(number) == false) {
      return false;
    }
    int backwards = 0;
    while (n != 0) {
      int d = n % 10;
      backwards = backwards * 10 + d;
      n /= 10;
    }
    return isPrime(BigInteger.valueOf(backwards));
  }
}