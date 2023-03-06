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
    
  }

  public static void readSideA(Long sideA[], Scanner object, Integer index) {
    if (index.equals(sideA.length)) {
      return;
    }
    sideA[index] = object.nextLong();
    System.out.println(sideA[index]);
    readSideA(sideA, object, index + 1);
  }

  public static void readSideB(Long sideB[], Scanner object, Integer index) {
    if (index.equals(sideB.length)) {
      return;
    }
    sideB[index] = object.nextLong();
    System.out.println(sideB[index]);
    readSideB(sideB, object, index + 1);
  }
}
