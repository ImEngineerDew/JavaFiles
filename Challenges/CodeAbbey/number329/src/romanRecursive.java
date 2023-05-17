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

  private static int result;
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

  private static void performOperations(Scanner object, int remain) {
    if (remain <= 0) {
      return;
    }
    String ops = object.nextLine();
    String tokens[] = ops.split("\\s+");
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
    String res = intToRoman(result);  //After to calculate their ops, let's turn to roman again!
    System.out.println(res);

    performOperations(object, remain - 1);
  }

  public static Integer romanToDecimal(String romanNumber) {
    return romanToDecimalRecursive(romanNumber, romanNumber.length() - 1, 0);
  }

  private static Integer romanToDecimalRecursive(String romanNumber, int index, int result) {
    if (index < 0) {
      return result;
    }
    char current = romanNumber.charAt(index);
    int currentVal = romanMap.get(current);
    int previousVal = (index > 0) ? romanMap.get(romanNumber.charAt(index - 1)) : 0;

    if (currentVal < previousVal) {
      result -= currentVal;
    } else {
      result += currentVal;
    }
    return romanToDecimalRecursive(romanNumber, index - 1, result);
  }

  public static String intToRoman(int number) {
    String[] units = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] decs = {" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] cents = {" ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] ths = {"", "M", "MM", "MMM"};

    return ths[number / 1000] + hrns[(number % 1000) / 100] + decs[(number % 100) / 10] + units[number % 10];
  }
}
