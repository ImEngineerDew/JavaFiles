import java.util.Scanner;
import java.math.BigInteger;
public class emirpNumber {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    System.out.println("Please write the size of your array: ");
    Integer size = object.nextInt();

    BigInteger arrayBigs[] = new BigInteger[size];
    readBigVectors(arrayBigs, object, 0);
    showBigVectors(arrayBigs, 0);
  }

  public static void readBigVectors(BigInteger vec[], Scanner sc, Integer i) {
    if (i < vec.length) {
      vec[i] = sc.nextBigInteger();
      readBigVectors(vec, sc, i + 1);
    }
  }

  public static void showBigVectors (BigInteger vec[], Integer i)
  {
    if (i <vec.length)
    {
      BigInteger result = oMirp(vec[i]);
      System.out.println(result);
      showBigVectors(vec, i+1);
    }
  }
}