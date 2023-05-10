import java.math.BigInteger;
import java.util.Random;

public class MillerRabin {

  public static boolean isProbablePrime(BigInteger number, int certainty) {
    if (number.equals(BigInteger.TWO) || number.equals(BigInteger.valueOf(3))) {
      return true;
    }
    if (number.compareTo(BigInteger.TWO) < 0 || number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      return false;
    }

    int rValue = 0;
    BigInteger d = number.subtract(BigInteger.ONE);
    while (d.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
      d = d.divide(BigInteger.TWO);
      rValue++;
    }

    for (int i = 0; i < certainty; i++) {
      BigInteger a = generateRand(number.subtract(BigInteger.TWO));
      BigInteger xValue = a.modPow(d, number);

      if (xValue.equals(BigInteger.ONE) || xValue.equals(number.subtract(BigInteger.ONE))) {
        continue;
      }

      boolean isWitness = false;
      for (int j = 0; j < rValue - 1; j++) {
        xValue = xValue.modPow(BigInteger.TWO, number);
        if (xValue.equals(BigInteger.ONE)) {
          return false;
        }
        if (xValue.equals(number.subtract(BigInteger.ONE))) {
          isWitness = true;
          break;
        }
      }

      if (!isWitness) {
        return false;
      }
    }

    return true;
  }

  private static BigInteger generateRand(BigInteger edge) {
    Random random = new Random();
    BigInteger result;
    do {
      result = new BigInteger(edge.bitLength(), random);
    } while (result.compareTo(edge) >= 0);
    return result;
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

  public static void main(String[] args) {
    BigInteger number = new BigInteger("70814551362513949286223");
    int certainty = 10;
    boolean isPrime = isProbablePrime(number, certainty);
    BigInteger next = nextProbablePrime(number);
    System.out.println("Next: "+next);
    System.out.println("Es primo: " + isPrime);
  }
}
