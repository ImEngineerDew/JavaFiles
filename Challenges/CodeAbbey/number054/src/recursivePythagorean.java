import java.util.Arrays;
import java.util.Scanner;

public class recursivePythagorean {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);
    System.out.print("Write the size of your array: ");
    int size = object.nextInt();

    Double pythagoras[] = new Double[size];
    readVector(pythagoras, object, 0);
    showResult(pythagoras,0);
  }

  public static void readVector(Double vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {
      long s = sc.nextLong();
      vec[index] = calculateSquaresAux(s, 1, 2);
      readVector(vec, sc, index + 1);
    }
  }
  public static void showResult(Double vec[], Integer index)
  {
    if(!index.equals(vec.length))
    {
      System.out.println(vec[index]+" ");
      showResult(vec,index+1);
    }
  }

  public static double calculateSquaresAux(long s, long m, long n) {
    while (m < Math.sqrt(s)) {
      while (n < m) {
        double a = (Math.pow(m, 2) - n * n);
        double b = 2 * m * n;
        double c = (Math.pow(m, 2)) + (Math.pow(n, 2));

        if (a + b + c == s) {
          double cSquared = Math.pow(c, 2);
          return cSquared;
        }
        n++;
      }
      m++;
      n = 1;
    }
    return 0;
  }
}