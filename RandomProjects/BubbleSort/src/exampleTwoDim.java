import java.util.Scanner;
public class exampleTwoDim {

  public static void main(String args[]) {

    Scanner obj = new Scanner(System.in);

    System.out.print("Write the size of your array: ");
    int size = obj.nextInt();

    Integer vectorList[] = new Integer[size];

    readArray(vectorList, obj,0);
    showBubble(vectorList, 0);
  }

  public static void showBubble(Integer vecRnd[], Integer index) {
    if (index.equals(vecRnd.length)) {
      return;
    }
    System.out.print(vecRnd[index] + " ");
    showBubble(vecRnd, index + 1);
  }

  public static void readArray(Integer vecRnd[],  Scanner sc,Integer index) {
    if (index.equals(vecRnd.length)) {
      return;
    }
    System.out.print("Write the numbers: ");
    vecRnd[index] = sc.nextInt();
    readArray(vecRnd, sc,index+1);
  }
}