import java.util.Arrays;
import java.util.Scanner;

public class recursiveGCD {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer size = object.nextInt();

    Integer vector[] = new Integer[size];
    Integer valA[] = new Integer[vector.length];
    Integer valB[] = new Integer[vector.length];

    readVector(valA, valB, object, 0);
    Integer gcdVal[] = calculateGCD(valA,valB,0);
    showVector(valA, valB, gcdVal,0);
  }

  public static void readVector(Integer vector[], Integer vectorB[], Scanner sc, Integer index) {
    if (!index.equals(vector.length)) {
      System.out.print("Write the values of vector A: ");
      vector[index] = sc.nextInt();

      System.out.print("Write the values of vector B: ");
      vectorB[index] = sc.nextInt();
      readVector(vector, vectorB, sc, index + 1);
    }
  }

  public static Integer[] calculateGCD(Integer[] vector, Integer[] vectorB, Integer index)
  {
    if (index == vector.length) {
      return new Integer[vector.length];
    }

    Integer[] gcdValue = calculateGCD(vector, vectorB, index + 1);
    gcdValue[index] = commonGreaterDivisor(vector[index], vectorB[index]);
    return gcdValue;
  }

  public static void showVector(Integer vector[], Integer vectorB[], Integer result[], Integer index) {
    if (!index.equals(vector.length)) {
      System.out.println(vector[index] + " " + vectorB[index]+" = "+result[index]);
      showVector(vector, vectorB, result,index + 1);
    }
  }

  public static Integer commonGreaterDivisor(Integer a, Integer b) {
    if (a < b) {
      return commonGreaterDivisor(b,a);
    } else if (b == 0) {
      return a;
    }
    return commonGreaterDivisor(b, a % b);
  }
}