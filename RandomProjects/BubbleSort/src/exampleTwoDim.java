import java.util.Scanner;

public class exampleTwoDim {
  public static void main(String args[]) {

    int i = 0,j=0;
    Scanner obj = new Scanner(System.in);

    System.out.print("Write the size of your array: ");
    int size = obj.nextInt();

    int vectorList[] = new int[size];
    readArray(vectorList,i,obj);
    bubbleRecursive(vectorList,i,j);
  }

  public static void readArray(int vecRnd[], int i, Scanner sc)
  {
    System.out.print("Write the numbers: ");
    vecRnd[i] = sc.nextInt();
    readArray(vecRnd,i,sc);
  }

  public static void bubbleRecursive(int vecRnd[], int i, int j) {
    if (i == vecRnd.length) {
      return;
    } else if (j == vecRnd.length) {
      //Put here the bubbleSort
      bubbleRecursive(vecRnd, i + 1, i + 1);
    } else {
      if (j == i) {
        System.out.print(vecRnd[j] + " ");
      }
      bubbleRecursive(vecRnd, i, j + 1);
    }
  }
}
