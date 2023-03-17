import java.util.Scanner;

public class recursivePythagorean {
  public static void main(String args[]) {

  }

  public static void readVector(Integer vec[], Scanner sc, Integer index) {
    if(!index.equals(vec.length)){
      return;
    }
    Integer s = sc.nextInt();
    Integer cSquared = 0;

    calculateSquaresAux(vec, s, 1, 2, cSquared);

    vec[index] = cSquared;
    readVector(vec,sc,index+1);
  }
  public static void calculateSquaresAux(Integer vector[], int s, int a, int B, int cSquared)
  {

  }
}
