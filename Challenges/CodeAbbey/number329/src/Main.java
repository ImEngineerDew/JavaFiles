import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static int result;

  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.print("Please write the quantity of the ops: ");
    int opQuantity = object.nextInt();
    object.nextLine(); //It makes a line jump

    for (int i = 0; i < opQuantity; i++) {
      //System.out.println("Write the roman numbers: ");
      String ops = object.nextLine();

      String[] tokens = ops.split("\\s+");
      String romNum1 = tokens[0];
      String symbolOp = tokens[1];
      String romNum2 = tokens[2];

      int decimal1 = romanToDecimal(romNum1); //Convert roman to decimal
      int decimal2 = romanToDecimal(romNum2); //Same thing but the second number

      if (symbolOp.equals("+")) {
        result = decimal1 + decimal2;
      } else {
        result = decimal1 - decimal2;
      }
      System.out.println(result);
    }
    System.out.flush();
    object.close();
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

    for (int i = romanNumber.length() - 1; i >= 0; i--) {
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

  public static String intToRoman (int number)
  {
     String [] units = {" ","I","II","III","IV","V","VI","VII","VIII","IX"};
     String [] decs = {" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
     String [] cents = {" ","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
}