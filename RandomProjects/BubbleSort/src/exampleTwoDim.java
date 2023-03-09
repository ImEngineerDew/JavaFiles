  import java.util.Scanner;
  public class exampleTwoDim {

    public static void main(String args[]) {

      Scanner obj = new Scanner(System.in);

      System.out.print("Write the size of your array: ");
      int size = obj.nextInt();

      Integer vectorList[] = new Integer[size];
      Integer swapsAndPasses[] = new Integer[]{0,0};

      readArray(vectorList, obj,0);
      showBubble(vectorList, 0);
      bubbleSortRecursive(vectorList,size -1,swapsAndPasses);

      System.out.println("Swaps: "+swapsAndPasses[0]);
      System.out.println("Passes: "+swapsAndPasses[1]);
      
    }  /** This recursive method can show the array **/
    public static void showBubble(Integer vecRnd[], Integer index) {
      if (index.equals(vecRnd.length)) {
        return;
      }
      System.out.print(vecRnd[index] + " ");
      showBubble(vecRnd, index + 1);
    }

    /** This recursive method read by keyboard the numbers on Scanner class **/
    public static void readArray(Integer vecRnd[],  Scanner sc,Integer index) {
      if (index.equals(vecRnd.length)) {
        return;
      }
      System.out.print("Write the numbers: ");
      vecRnd[index] = sc.nextInt();
      readArray(vecRnd, sc,index+1);
    }
    public static void bubbleSortRecursive(Integer[] vectorRandom, Integer k, Integer[] swapsPasses) {
      if (k.equals(0)) {
        return;
      }
      boolean isSwapped = false;
      for (int l = 0; l < k; l++) {
        if (vectorRandom[l] > vectorRandom[l + 1]) {
          int flagHelper = vectorRandom[l];
          vectorRandom[l] = vectorRandom[l + 1];
          vectorRandom[l + 1] = flagHelper;
          isSwapped = true;
          swapsPasses[0]++; /** Increase swaps **/
        }
      }
      swapsPasses[1]++; /** Increase passes **/
      if (isSwapped) {
        bubbleSortRecursive(vectorRandom, k-1, swapsPasses);
      }
    }
  }