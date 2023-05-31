import java.util.Scanner;

public class recursiveBackwards {
    static Scanner object = new Scanner(System.in);
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String args[]) {
        String text = object.nextLine();
        String backwards = reverseString(text);
        System.out.println(backwards);
    }
}
