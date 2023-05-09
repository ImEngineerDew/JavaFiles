import java.util.Scanner;
import java.math.BigInteger;

public class bigIntegersDef {
  public static void main(String args[]) {

  }

  public static void readBigVectors(BigInteger vec[], Scanner sc, Integer i) {
    if (i < vec.length) {
      vec[i] = sc.nextBigInteger();
      readBigVectors(vec, sc, i + 1);
    }
  }

  public static void showBigsVector(BigInteger vec[], Integer i) {
    if (i < vec.length) {
      BigInteger result = oMirp(vec[i]);
      System.out.println(result);
      showBigsVector(vec, i + 1);
    }
  }

  public static boolean isProbablePrime(BigInteger number, int confidence) {
    if (number.equals(BigInteger.TWO) || number.equals(BigInteger.valueOf(3)))) {
      return true;
    }
    if (number.compareTo(BigInteger.TWO )<0 || number.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
      return false;
    }
    int rValue = 0;
    BigInteger d = number.subtract(BigInteger.ONE);
    while (d.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
      d = d.divide(BigInteger.TWO);
      rValue++;
    }
    for (int i = 0; i <confidence; i++)
    {
      BigInteger aValue = generateRandom(number.subtract(BigInteger.TWO));
      BigInteger x = aValue.modPow(d, number);
    }
  }
}
