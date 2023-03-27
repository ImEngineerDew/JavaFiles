import java.util.Scanner;

public class recursiveGCD {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer size = object.nextInt();
    Integer index = 0;

    Integer vector[] = new Integer[size];
    Integer valA[] = new Integer[vector.length];
    Integer valB[] = new Integer[vector.length];

    rV(valA, valB, object, index);
    Integer gcdVal[] = calculateGCD(valA, valB, index);
    showV(valA, valB, gcdVal, index);
  }

  public static void rV(Integer vector[], Integer vectorB[], Scanner sc, Integer i) {
    if (!i.equals(vector.length)) {
      vector[i] = sc.nextInt();
      vectorB[i] = sc.nextInt();

      rV(vector, vectorB, sc, i + 1);
    }
  }

  public static Integer[] calculateGCD(Integer[] vector, Integer[] vectorB, Integer index) {
    if (index == vector.length) {
      return new Integer[vector.length];
    }
    Integer[] gcdValue = calculateGCD(vector, vectorB, index + 1);
    gcdValue[index] = commonGreaterDivisor(vector[index], vectorB[index]);
    return gcdValue;
  }

  public static void showV(Integer vector[], Integer vectorB[], Integer result[], Integer i) {
    if (!i.equals(vector.length)) {
      Integer[] coe = bezout(vector[i], vectorB[i], vector[i], 1, 0, vectorB[i], 0, 1);
      System.out.println(result[i] + " " + coe[1] + " " + coe[2]);
      showV(vector, vectorB, result, i + 1);
    }
  }

  public static Integer commonGreaterDivisor(Integer a, Integer b) {
    if (a < b) {
      return commonGreaterDivisor(b, a);
    } else if (b == 0) {
      return a;
    }
    Integer[] coefficients = bezout(a, b, a, 1, 0, b, 0, 1);
    return coefficients[0];
  }

  public static Integer[] bezout(Integer a, Integer b, Integer r, Integer s, Integer t, Integer previousR, Integer previousS, Integer previousT) {
    if (r == 0) {
      Integer result[] = {previousR, previousS, previousT};
      return result;
    } else {
      Integer quotient = previousR / r;
      Integer temp = previousR % r;
      previousR = r;
      r = temp;

      temp = previousS - quotient * s;
      previousS = s;
      s = temp;

      temp = previousT - quotient * t;
      previousT = t;
      t = temp;

      return bezout(a, b, r, s, t, previousR, previousS, previousT);
    }
  }
}