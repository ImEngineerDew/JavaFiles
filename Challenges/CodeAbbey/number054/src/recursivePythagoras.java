import java.util.Scanner;

public class recursivePythagoras {
  public static void main(String args[]) {

  }

  public static void readVector(Long vector[], Scanner sc, Integer index) {
    if (index.equals(vector.length)) {
      return;
    }
    Long s = sc.nextLong();
    vector[index] = calculateSquares(s, 2, 1);
  }

}
