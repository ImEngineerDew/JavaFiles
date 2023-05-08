import java.util.Scanner;

public class recursiveGCD {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    Integer size = object.nextInt();
    Integer index = 0;

    Integer vector[] = new Integer[size];
    Integer valA[] = new Integer[vector.length];
    Integer valB[] = new Integer[vector.length];

    r(valA, valB, object, index);
    Integer gcdVal[] = calcGCD(valA, valB, index);
    shV(valA, valB, gcdVal, index);
  }

  public static void r(Integer vA[], Integer vB[], Scanner sc, Integer index) {
    if (!index.equals(vA.length)) {
      vA[index] = sc.nextInt();
      vB[index] = sc.nextInt();

      r(vA, vB, sc, index + 1);
    }
  }

  public static Integer[] calcGCD(Integer[] vA, Integer[] vB, Integer index) {
    if (index == vA.length) {
      return new Integer[vA.length];
    }
    Integer[] gcdValue = calcGCD(vA, vB, index + 1);
    gcdValue[index] = commonGreaterDivisor(vA[index], vB[index]);
    return gcdValue;
  }

  public static void shV(Integer vA[], Integer vB[], Integer rs[], Integer i) {
    if (!i.equals(vA.length)) {
      int[] coe = bezout(vA[i], vB[i], vA[i], 1, 0, vB[i], 0, 1);
      System.out.println(rs[i] + " " + coe[1] + " " + coe[2]+" ");
      shV(vA, vB, rs, i + 1);
    }
  }

  public static Integer commonGreaterDivisor(Integer a, Integer b) {
    if (a < b) {
      return commonGreaterDivisor(b, a);
    } else if (b == 0) {
      return a;
    }
    int[] coefficients = bezout(a, b, a, 1, 0, b, 0, 1);
    return coefficients[0];
  }

  static int[] bezout(int a, int b, int r, int s, int t, int x, int y, int z) {
    if (r == 0) {
      int result[] = {x, y, z};
      return result;
    } else {
      int quotient = x / r;
      int temp = x % r;
      x = r;
      r = temp;

      temp = y - quotient * s;
      y = s;
      s = temp;

      temp = z - quotient * t;
      z = t;
      t = temp;

      return bezout(a, b, r, s, t, x, y, z);
    }
  }
}