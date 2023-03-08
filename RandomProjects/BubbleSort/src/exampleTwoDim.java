import java.util.Scanner;

public class exampleTwoDim {

  public static void main(String args[]) {

    int i = 0, j = 0;

    Scanner obj = new Scanner(System.in);

    System.out.print("Write the size of your array: ");
    int size = obj.nextInt();

    int vectorList[] = new int[size];
    readArray(vectorList, i, obj);

    int resolution[] = bubbleRecursive(vectorList, i, j);
    showBubble(vectorList, i);
    System.out.println(resolution[1]);
    System.out.println(resolution[0]);
  }

  public static void showBubble(int vecRnd[], int i) {
    if (i == vecRnd.length) {
      return;
    }
    System.out.print(vecRnd[i] + " ");
    showBubble(vecRnd, i + 1);
  }

  public static void readArray(int vecRnd[], int i, Scanner sc) {
    if (i == vecRnd.length) {
      return;
    }
    System.out.print("Write the numbers: ");
    vecRnd[i] = sc.nextInt();
    readArray(vecRnd, i + 1, sc);
  }

  public static int[] bubbleRecursive(int vecRnd[], int j, int k) {
    int[] resolution = new int[]{0, 0};
    if (j == vecRnd.length - 1) {
      return resolution;
    } else if (k == vecRnd.length - j - 1) {
      int[] next = bubbleRecursive(vecRnd, j + 1, 0);
      resolution[0] += next[0];
      resolution[1] += next[1] + 1;
      return resolution;
    } else {
      // Put here the bubbleSort
      int[] next = bubbleRecursive(vecRnd, j, k + 1);
      resolution[0] += next[0];
      resolution[1] += next[1];
      if (vecRnd[k] > vecRnd[k + 1]) {
        int flagHelper = vecRnd[k];
        vecRnd[k] = vecRnd[k + 1];
        vecRnd[k + 1] = flagHelper;
        resolution[0]++;
      }
      return resolution;
    }
  }
}