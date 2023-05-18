import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romanRecursive {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.print("Please write the quantity of the ops: ");
    int opQuantity = object.nextInt();
    object.nextLine(); //It makes a line jump

    performOperations(object, opQuantity);

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

  private static void performOperations(Scanner scanner, int remainingOps) {
    if (remainingOps <= 0) {
      return;
    }

    System.out.print("Write the roman numbers: ");
    String ops = scanner.nextLine();

    String[] tokens = ops.split("\\s+");
    String romNum1 = tokens[0];
    String symbolOp = tokens[1];
    String romNum2 = tokens[2];

    int decimal1 = romanToDecimal(romNum1); //Convert roman to decimal
    int decimal2 = romanToDecimal(romNum2); //Same thing but the second number

    int result;
    if (symbolOp.equals("+")) {
      result = decimal1 + decimal2;
    } else {
      result = decimal1 - decimal2;
    }

    String res = intToRoman(result);
    System.out.println(res);

    performOperations(scanner, remainingOps - 1);
  }

  public static Integer romanToDecimal(String romanNumber) {
    return romanToDecimalRecursive(romanNumber, 0, romanNumber.length() - 1);
  }

  private static Integer romanToDecimalRecursive(String romanNumber, int left, int right) {
    if (left > right) {
      return 0;
    }

    if (left == right) {
      return romanMap.get(romanNumber.charAt(left));
    }

    int current = romanMap.get(romanNumber.charAt(left));
    int next = romanMap.get(romanNumber.charAt(left + 1));

    if (current < next) {
      return next - current + romanToDecimalRecursive(romanNumber, left + 2, right);
    } else {
      return current + romanToDecimalRecursive(romanNumber, left + 1, right);
    }
  }

  public static String intToRoman(int number) {
    if (number <= 0 || number > 3999) {
      return "Invalid number";
    }

    return intToRomanRecursive(number);
  }

  private static String intToRomanRecursive(int number) {
    if (number >= 1000) {
      return "M" + intToRomanRecursive(number - 1000);
    } else if (number >= 900) {
      return "CM" + intToRomanRecursive(number - 900);
    } else if (number >= 500) {
      return "D" + intToRomanRecursive(number - 500);
    } else if (number >= 400) {
      return "CD" + intToRomanRecursive(number - 400);
    } else if (number >= 100) {
      return "C" + intToRomanRecursive(number - 100);
    } else if (number >= 90) {
      return "XC" + intToRomanRecursive(number - 90);
    } else if (number >= 50) {
      return "L" + intToRomanRecursive(number - 50);
    } else if (number >= 40) {
      return "XL" + intToRomanRecursive(number - 40);
    } else if (number >= 10) {
      return "X" + intToRomanRecursive(number - 10);
    } else if (number >= 9) {
      return "IX" + intToRomanRecursive(number - 9);
    } else if (number >= 5) {
      return "V" + intToRomanRecursive(number - 5);
    } else if (number >= 4) {
      return "IV" + intToRomanRecursive(number - 4);
    } else if (number >= 1) {
      return "I" + intToRomanRecursive(number - 1);
    } else {
      return "";
    }
  }
}
