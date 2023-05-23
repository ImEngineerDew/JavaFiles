import java.util.Scanner;

public class recursivePythagoras {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);
    int size = object.nextInt();

    Double pythagoras[] = new Double[size];
    readVector(pythagoras, object, 0);
    showResult(pythagoras, 0);
  }

  public static void readVector(Double vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {
      Long s = sc.nextLong();
      vec[index] = calculateSquares(s, 1, 2);
      readVector(vec, sc, index + 1);
    }
  }

  public static void showResult(Double vec[], Integer index) {
    if (!index.equals(vec.length)) {
      System.out.printf("%.0f", vec[index]);
      System.out.println(" ");
      showResult(vec, index + 1);
    }
  }

  public static Double calculateRecursive(long s, long m, long n) {
    if (n >= m) {
      return 0.0;
    }
    Double a = Math.pow(m, 2) - n * n;
    Double b = 2.0 * m * n;
    Double c = (Math.pow(m, 2)) + (Math.pow(n, 2));

    if (a + b + c == s) {
      Double cSquared = Math.pow(c, 2);
      return cSquared;
    }
    return calculateRecursive(s, m, n + 1);
  }

  public static Double calculateSquares(long s, long m, long n) {
    if (m > Math.sqrt(s)) {
      return 0.0;
    }
    Double result = calculateRecursive(s, m, 1);
    if (result != 0.0) {
      return result;
    }
    return calculateSquares(s, m + 1, 1);
  }
}