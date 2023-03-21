import java.util.Scanner;

public class recursivePythagorean {
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
      vec[index] = calculateSquaresAux(s, 1, 2);
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

  public static Double calculateSquaresAux(long s, long m, long n) {
    if (m > Math.sqrt(s)) {
      return 0.0;
    }
    if (n < m) {
      Double a = Math.pow(m, 2) - n * n;
      Double b = 2.0 * m * n;
      Double c = (Math.pow(m, 2)) + (Math.pow(n, 2));

      if (a + b + c == s) {
        Double cSquared = Math.pow(c, 2);
        return cSquared;
      }
      return calculateSquaresAux(s, m, n + 1);
    }
    return calculateSquaresAux(s, m + 1, 1);
  }
}

    /**
     for (m = 2; m <= Math.sqrt(s); m++) {
     for (n = 1; n < m; n++) {
     Double a = Math.pow(m, 2) - n * n;
     Double b = 2.0 * m * n;
     Double c = (Math.pow(m, 2)) + (Math.pow(n, 2));

     if (a + b + c == s) {
     Double cSquared = Math.pow(c, 2);
     return cSquared;
     }
     }
     }
     return 0.0;
     }
     **/
