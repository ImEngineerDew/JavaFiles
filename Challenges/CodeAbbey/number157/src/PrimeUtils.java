import java.math.BigInteger;

public class PrimeUtils {

  public static boolean isProbablePrime(BigInteger number, int conf) {
    return number.isProbablePrime(conf);
  }

  public static boolean isEmirp(BigInteger number) {
    String numberStr = number.toString();
    BigInteger reversedNumber = new BigInteger(new StringBuilder(numberStr).reverse().toString());
    return !number.equals(reversedNumber) && isProbablePrime(number, 10) && isProbablePrime(reversedNumber, 10);
  }

  public static BigInteger nextProbablePrime(BigInteger number) {
    if (number.compareTo(BigInteger.TWO) < 0) {
      return BigInteger.TWO;
    }
    if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      number = number.add(BigInteger.ONE);
    } else {
      number = number.add(BigInteger.TWO);
    }
    while (!isProbablePrime(number, 10)) {
      number = number.add(BigInteger.TWO);
    }
    return number;
  }

  public static BigInteger nextEmirp(BigInteger number) {
    BigInteger nextPrime = nextProbablePrime(number);
    while (!isEmirp(nextPrime)) {
      nextPrime = nextProbablePrime(nextPrime);
    }
    return nextPrime;
  }

  public static void main(String[] args) {
    BigInteger number = new BigInteger("70814551362513949286223");
    boolean isPrime = isProbablePrime(number, 10);

    BigInteger nextEmirp = nextEmirp(number);
    System.out.println("El siguiente Emirp es: " + nextEmirp);
  }
}
