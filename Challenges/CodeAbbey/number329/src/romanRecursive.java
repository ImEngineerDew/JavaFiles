import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class romanRecursive {
  public static void main(String args[]) {
    Scanner object = new Scanner(System.in);
    int opQuantity = object.nextInt();
    object.nextLine(); // it makes a jump line
    performOperations(object, opQuantity);
    object.close();
  }
}
