import java.math.BigInteger;
import java.util.Scanner;

public class nonRecursivePrimes {
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
      numPrime[i] = isPrime(primes,2);
    }
    for (int j = 0; j < size; j++) {
      BigInteger primes = inputNumbers[j];
      if (numPrime[j] == true) {
        System.out.println(primes + " is a prime number");
      } else if (numPrime[j] == false) {
        System.out.println(primes + " isn't a prime number");
      }
    }
  }

  public static boolean isPrime(BigInteger num,int i) {
    int numFor = num.intValue();
    if (num == BigInteger.ZERO || num == BigInteger.ONE || num.intValue() == 4) {
      return false;
    }
    for (;i < numFor / 2; i++) {
      if (numFor % i == 0) {
        return false;
      }
    }
    return true;
  }

  //This is a code stub that backwards their number prior to calculate if this number is prime or no
  public static boolean eMirpNum(BigInteger number) {
    int n = number.intValue();
    if(!isPrime(number,2))
    {
      return false;
    }
    int backwards = 0;
    while(n!=0)
    {
      int d = n%10;
      backwards = backwards*10+d;
      n/=10;
    }
    return isPrime(BigInteger.valueOf(backwards),2);
  }
}