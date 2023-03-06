import java.util.Scanner;

public class recursiveFor {
  public static void recursiveIteration(Integer index, Integer n) {
    if (index <= n) {
      System.out.print(index);
      recursiveIteration(index + 1, n);
    }
  }

  public static void otherRecursive(Integer n) {
    if (n.equals(0)) {
      return;
    } else {
      otherRecursive(n - 1);
      System.out.print(n+" ");
    }
  }

  public static void main(String[] args) {

    Scanner object = new Scanner(System.in);

    System.out.print("Write the number to iterate: ");
    int numbers = object.nextInt();

    //recursiveIteration(1, numbers);
    otherRecursive(numbers);
  }
}
