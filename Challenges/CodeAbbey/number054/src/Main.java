import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner object = new Scanner(System.in);

    System.out.print("Write the size of your array: ");
    int size = object.nextInt();

    BigInteger vector[] = new BigInteger[size];

    for (BigInteger i = BigInteger.ZERO; i.compareTo(BigInteger.valueOf(vector.length)) < 0; i = i.add(BigInteger.ONE)) {
      System.out.print("Write the number to calculate their squares: ");
      BigInteger s = object.nextBigInteger();

      BigInteger cSquared = BigInteger.ZERO;
      for (BigInteger a = BigInteger.ONE; a.compareTo(s) < 0; a = a.add(BigInteger.ONE)) {
        for (BigInteger b = a.add(BigInteger.ONE); b.compareTo(s) < 0; b = b.add(BigInteger.ONE)) {
          BigInteger c = BigInteger.valueOf((long) Math.sqrt(Math.pow(a.longValue(), 2) + Math.pow(b.longValue(), 2)));
          if (a.add(b).add(c).equals(s) && c.compareTo(a) > 0 && c.compareTo(b) > 0 && a.pow(2).add(b.pow(2)).equals(c.pow(2))) {
            cSquared = c.pow(2);
          }
        }
      }
    }

    System.out.println("Values of c squared:");
    for (int i = 0; i < vector.length; i++) {
      System.out.println(vector[i]);
    }
  }
}
