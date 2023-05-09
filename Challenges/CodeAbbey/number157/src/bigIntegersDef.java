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
      BigInteger result = oMirp (vec[i]);
      System.out.println(result);
      showBigsVector(vec, i+1);
    }
  }
}
