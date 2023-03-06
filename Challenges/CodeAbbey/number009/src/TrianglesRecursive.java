import java.util.Scanner;

public class TrianglesRecursive {
  public static void main(String args[]) {

    Scanner element = new Scanner(System.in);

    System.out.println("Write the size of your array: ");
    Integer size = element.nextInt();
    int i = 0;

    Long sideA[] = new Long[size];
    Long sideB[] = new Long[sideA.length];
    Long sideC[] = new Long[sideA.length];

    triRd(sideA, sideB, sideC, element, i);
    checkS(sideA, sideB, sideC, i);
  }

  public static void triRd(Long A[], Long B[], Long C[], Scanner sc, Integer i) {
    if (i.equals(A.length) || (i.equals(B.length))|| (i.equals(C.length))) {
      return;
    }
    System.out.print("Write the length of side A: ");
    A[i] = sc.nextLong();
    System.out.print("Write the length of side B: ");
    B[i] = sc.nextLong();
    System.out.print("Write the length of side C: ");
    C[i] = sc.nextLong();
    triRd(A,B,C,sc,i+1);
  }
  public static void checkS(Long sdA[], Long sdB[], Long sdC[], Integer i) {
    if (i.equals(sdA.length) || i.equals(sdB.length) || i.equals(sdC.length)) {
      return;
    }
    if ((sdA[i] + sdB[i]) > sdC[i]) {
      if ((sdA[i] + sdC[i]) > sdB[i]) {
        if ((sdB[i] + sdC[i]) > sdA[i]) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      } else {
        System.out.print(0 + " ");
      }
    } else {
      System.out.print(0 + " ");
    }
    checkS(sdA, sdB, sdC, i + 1);
  }
}