import java.util.Scanner;

public class recursivePythagorean {
  public static void main(String args[]) {

    Scanner object = new Scanner(System.in);
    System.out.println("Write the size of your array: ");
    
  }

  public static void readVector(Integer vec[], Scanner sc, Integer index) {
    if (!index.equals(vec.length)) {
      return;
    }
    Integer s = sc.nextInt();
    Integer cSquared = 0;

    calculateSquaresAux(vec, s, 1, 2, cSquared);

    vec[index] = cSquared;
    readVector(vec, sc, index + 1);
  }

  public static void calculateSquaresAux(Integer vector[], int s, int a, int b, int cSquared) {
    if (a >= s || b >= s) {
      return;
    }
    int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    if (a + b + c == s && c > a && c > b && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
      cSquared = (int) Math.pow(c, 2);
    }
    calculateSquaresAux(vector,s,a,b,cSquared);
  }
}
