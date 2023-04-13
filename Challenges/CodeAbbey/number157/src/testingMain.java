import java.util.Scanner;
import java.math.BigInteger;

public class testingMain {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);

    System.out.println("Please write the size of your array: ");
    Integer size = object.nextInt();

    BigInteger input[] = new BigInteger[size];
    boolean numberPrime[] = new boolean[size];
  }
  public static void readVector(BigInteger input[], boolean pri[], Scanner sc, int i, int j)
  {
    if(i== input.length) {
      BigInteger primes = sc.nextBigInteger();
      input[i] = primes;
      pri[i] = Main.isPrime(primes);
    }
  }

}
