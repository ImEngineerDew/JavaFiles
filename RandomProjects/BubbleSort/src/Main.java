import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int i;
    int swaps = 0, passes = 0;
    Scanner object = new Scanner(System.in);

    System.out.print("Write the size of your vector: ");
    Integer size = object.nextInt();

    Integer vectorRandom[] = new Integer[size];
    Integer flagHelper = 0;

    for (i = 0; i < vectorRandom.length; i++) {
      System.out.print("Write the numbers: ");
      vectorRandom[i] = object.nextInt();
    }
    boolean isSwapped = true;
    for (int k = vectorRandom.length-1;  k > 0 && isSwapped; k--) {
      isSwapped = false;
      for (int l = 0; l < k; l++) {
        if (vectorRandom[l] > vectorRandom[l + 1]) {
          flagHelper = vectorRandom[l];
          vectorRandom[l] = vectorRandom[l + 1];
          vectorRandom[l + 1] = flagHelper;
          isSwapped = true;
          swaps++;
        }
      }
      passes++;
      if (!isSwapped) {
        break;
      }
    }
    System.out.println("Data sorted: " + Arrays.toString(vectorRandom));
    System.out.println("Times passed:" + passes);
    System.out.println("Times exchanged: " + swaps);
  }
}