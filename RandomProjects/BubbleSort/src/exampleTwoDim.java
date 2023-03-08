public class exampleTwoDim {
  public static void main(String args[]) {
    int vectorList[] = {1, 2, 3, 4, 5};
    printVector(vectorList);
  }

  public static void printVector(int vector[]) {
    bubbleRecursive(vector, 0, 0);
  }

  public static void bubbleRecursive(int vecRnd[], int i, int j) {
    if (i == vecRnd.length) {
      return;
    } else if (j == vecRnd.length) {

      bubbleRecursive(vecRnd, i + 1, i + 1);
    } else {
      if (j == i) {
        System.out.print(vecRnd[j] + " ");
      }
      bubbleRecursive(vecRnd, i, j + 1);
    }
  }

}
