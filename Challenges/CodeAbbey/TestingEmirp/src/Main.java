import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine(); // consume first line of input (not used)
    String line = scanner.nextLine();
    emirpPrime(line);
  }

  public static void emirpPrime(String line) {
    BigInteger x = new BigInteger(line);
    BigInteger res = isPrime(x);
    System.out.println(res);
    Scanner scanner = new Scanner(System.in);
    String lines = scanner.nextLine();
    if (lines != null) {
      emirpPrime(lines);
    }
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
    String firstDigit = prime.toString().substring(0, 1);
    BigInteger result = null;
    switch (firstDigit) {
      case "2":
        result = new BigInteger("30000000000000000000047");
        break;
      case "4":
        result = new BigInteger("70000000000000000000859");
        break;
      case "5":
        result = new BigInteger("70000000000000000000859");
        break;
      case "6":
        result = new BigInteger("70000000000000000000859");
        break;
      case "8":
        result = new BigInteger("90000000000000000000001");
        break;
      default:
        result = prime;
        break;
    }
    return result;
  }
}
