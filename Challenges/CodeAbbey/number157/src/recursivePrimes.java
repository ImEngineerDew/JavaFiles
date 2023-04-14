import java.math.BigInteger;
import java.util.Scanner;

public class recursivePrimes {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    System.out.print("Please write the size of your array: ");

    Integer size = object.nextInt();
    BigInteger arrayBigs[] = new BigInteger[size];
    readBigsVector(arrayBigs,object,0);  //readVector starting here
  }

  public static void readBigsVector(BigInteger vec[], Scanner sc, int i) {
    if (i < vec.length) {
      System.out.print("Write your numbers to evaluate: ");
      vec[i] = sc.nextBigInteger();
      readBigsVector(vec, sc, i + 1);
    }
  }
}