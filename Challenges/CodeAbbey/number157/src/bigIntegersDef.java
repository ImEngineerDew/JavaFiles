import java.util.Random;
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
      //BigInteger result = oMirp(vec[i]);
      //System.out.println(result);
      showBigsVector(vec, i + 1);
    }
  }

  public static boolean isProbablePrime(BigInteger number, int confidence) {
    if (number.equals(BigInteger.TWO) || number.equals(BigInteger.valueOf(3))) {
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
      BigInteger aValue = generateRand(number.subtract(BigInteger.TWO));
      BigInteger xValue = aValue.modPow(d, number);

      if (xValue.equals(BigInteger.ONE) || xValue.equals(number.subtract(BigInteger.ONE))){
        continue;
      }

      boolean isWitness = false;
      for (int j =0; j<rValue -1; j++)
      {
        xValue = xValue.modPow(BigInteger.TWO,number);
        if(xValue.equals(BigInteger.ONE)){
          return false;
        }
        if(xValue.equals(number.subtract(BigInteger.ONE))){
          isWitness = true;
          break;
        }
      }
      if(!isWitness){
        return false;
      }
    }
    return true;
  }
  private static BigInteger generateRand(BigInteger edge){
    Random rnd = new Random();
    BigInteger result = BigInteger.ZERO;
    while(result.compareTo(edge)>=0)
    {
      result = new BigInteger(edge.bitLength(),rnd);
    }
    return result;
  }
}
