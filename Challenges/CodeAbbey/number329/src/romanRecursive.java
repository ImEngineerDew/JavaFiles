import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romanRecursive {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
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

        String romNum1 = scanner.next();
        String symbolOp = scanner.next();
        String romNum2 = scanner.next();
        scanner.nextLine();         //Line jump

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

    public static String intToRomanRecursive(int number) {
        String[] units = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decs = {" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] cents = {" ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ths = {"", "M", "MM", "MMM"};

        return ths[number / 1000] + hrns[(number % 1000) / 100] + decs[(number % 100) / 10] + units[number % 10];
    }
}
