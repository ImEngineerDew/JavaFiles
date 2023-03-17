import java.util.Scanner;

public class recursivePythagorean {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);
    System.out.print("Write the size of your array: ");
    Integer size = object.nextInt();

    Long pythagoras[] = new Long[size];

    readVector(pythagoras, object, 0);

    for (int i = 0; i < pythagoras.length; i++) {
      System.out.println(pythagoras[i]);
    }
  }

  public static void readVector(Long vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {

      System.out.print("Write the following numbers: ");
      long s = sc.nextLong();
      long cSquared = calculateSquaresAux(s, 1, 2);

      if (cSquared != 0) {
        vec[index] = cSquared;
      } else {
        System.out.println("No pythagorean triple found for the given sum.");
      }

      readVector(vec, sc, index + 1);
    } else {
      System.out.println("Calculation finished.");
    }
  }

  public static int calculateSquaresAux(long s, long a, long b) {
    if (a >= s || b >= s) {
      return 0;
    }
    long cSquared = 0;
    long c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    if (a + b + c == s && c > a && c > b && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
      cSquared = (int) Math.pow(c, 2);
    }
    return (int) (cSquared + calculateSquaresAux(s, a + 2, 0));
  }
}
