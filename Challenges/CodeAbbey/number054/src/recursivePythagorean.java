import java.util.Scanner;

public class recursivePythagorean {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);
    System.out.print("Write the size of your array: ");
    Integer size = object.nextInt();

    Integer pythagoras[] = new Integer[size];

    readVector(pythagoras, object, 0);

    for (int i = 0; i < pythagoras.length; i++) {
      System.out.println(pythagoras[i]);
    }
  }

  public static void readVector(Integer vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {

      System.out.print("Write the following numbers: ");
      Integer s = sc.nextInt();
      Integer cSquared = calculateSquaresAux(s, 1, 2);

      vec[index] = cSquared;
      readVector(vec, sc, index + 1);
    }
  }

  public static int calculateSquaresAux(int s, int a, int b) {
    if (a >= s || b >= s) {
      return 0;
    }
    Integer cSquared = 0;
    Integer c = (int)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    if (a + b + c == s && c > a && c > b && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
      cSquared = (int)Math.pow(c, 2);
    }
    if (b == s-1) {
      return (cSquared + calculateSquaresAux(s, a + 2, 0));
    } else {
      return (cSquared + calculateSquaresAux(s, a, b + 1));
    }
  }
}
