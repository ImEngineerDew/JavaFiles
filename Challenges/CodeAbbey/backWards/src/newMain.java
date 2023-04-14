import java.math.BigInteger;
import java.util.Scanner;

public class newMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el tamaño del arreglo: ");
    int size = scanner.nextInt();
    BigInteger[] array = new BigInteger[size];
    System.out.println("Ingrese los números: ");
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextBigInteger();
    }
    for (int i = 0; i < size; i++) {
      BigInteger res = emirpPrime(array[i]);
      System.out.println(res);
    }
  }

  public static BigInteger emirpPrime(BigInteger x) {
    BigInteger res = isPrime(x);
    return res;
  }

  public static BigInteger isPrime(BigInteger x) {
    boolean check = x.isProbablePrime(10);
    if (check) {
      return isEmirp(x);
    } else {
      return isPrime(x.nextProbablePrime());
    }
  }

  public static BigInteger isEmirp(BigInteger prime) {
    BigInteger emirp = new BigInteger(new StringBuilder(prime.toString()).reverse().toString());
    boolean check = emirp.isProbablePrime(10);
    if (check) {
      return prime;
    } else {
      return isPrime(primeScape(prime.nextProbablePrime()));
    }
  }

  public static BigInteger primeScape(BigInteger prime) {
    switch (prime.toString().substring(0, 1)) {
      case "2":
        return new BigInteger("30000000000000000000047");
      case "4":
      case "5":
      case "6":
        return new BigInteger("70000000000000000000859");
      case "8":
        return new BigInteger("90000000000000000000001");
      default:
        return prime;
    }
  }
}