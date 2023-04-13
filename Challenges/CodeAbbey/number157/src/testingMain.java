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
    showNumbers(input,numberPrime,0);
  }

  public static void readNumbers(BigInteger input[], boolean pri[], Scanner sc, Integer i) {
    if (!i.equals(input.length)) {
      BigInteger primes = sc.nextBigInteger();
      input[i] = primes;
      pri[i] = Main.isPrime(primes);
      readNumbers(input, pri, sc, i + 1);
    }
  }

  public static void showNumbers(BigInteger input[], boolean pri[], Integer j) {
    if (j< input.length) {
      BigInteger primes = input[j];
      if (pri[j] == true) {
        System.out.println(primes + " is a prime number");
      } else {
        System.out.println(primes + " isn't a prime number");
      }
      showNumbers(input, pri, j+1);
    }
  }
}
