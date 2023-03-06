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

    readSideA(sideA, element, i);
    readSideB(sideB, element, i);
    readSideC(sideC, element, i);
    checkS(sideA,sideB,sideC,i);
  }

  public static void readSideA(Long sideA[], Scanner object, Integer index) {
    if (index.equals(sideA.length)) {
      return;
    }
    System.out.print("Write the length of side A: ");
    sideA[index] = object.nextLong();
    readSideA(sideA, object, index + 1);
  }

  public static void readSideB(Long sideB[], Scanner object, Integer index) {
    if (index.equals(sideB.length)) {
      return;
    }
    System.out.print("Write the length of side B: ");
    sideB[index] = object.nextLong();
    readSideB(sideB, object, index + 1);
  }

  public static void readSideC(Long sideC[], Scanner object, Integer index) {
    if (index.equals(sideC.length)) {
      return;
    }
    System.out.print("Write the length of side C: ");
    sideC[index] = object.nextLong();
    readSideC(sideC, object, index + 1);
  }

  public static void checkS(Long sdA[], Long sdB[], Long sdC[], Integer i){
    if(i.equals(sdA.length)||i.equals(sdB.length)||i.equals(sdC.length)){
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
    checkS(sdA,sdB,sdC,i+1);
  }
}