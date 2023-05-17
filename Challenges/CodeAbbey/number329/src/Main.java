import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.println("Please write the quantity of the ops: ");
    int opQuantity = object.nextInt();
    object.nextLine(); //It makes a line jump

    for (int i =0; i<opQuantity; i++)
    {
      System.out.println("Write the roman numbers: ");
      String ops = object.nextLine();

      String [] tokens = ops.split("\\s+");
      String romNum1 =  tokens[0];
      String symbolOp = tokens[1];
      String romNum2 = tokens[2];

    }

  }

  private static Map<Character, Integer> romanMap = new HashMap<>();

  /** List the roman numbers **/
  static {
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);
  }

  public static Integer romanToDecimal(String romanNumber) {
    int numberDec = 0;
    int previousVal = 0;

    for (int i = romanNumber.length() - 1; i > 0; i--) {
      char current = romanNumber.charAt(i);
      int currentVal = romanMap.get(current);

      if (currentVal < previousVal) {
        numberDec -= currentVal;
      } else {
        numberDec += currentVal;
      }
      previousVal = currentVal;
    }
    return numberDec;
  }


}