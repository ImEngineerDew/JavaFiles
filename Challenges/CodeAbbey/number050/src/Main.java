import java.util.Scanner;

public class Main {
    static Scanner object = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please write the amount of you array: ");
        Integer size = object.nextInt();
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void readStr(String vecA[], Scanner sc, Integer index) {
        if (index.equals(vecA.length)) {
            return;
        }
        System.out.println("Please write the next quotes: ");
        vecA[index] = sc.nextLine();
        readStr(vecA, sc, index + 1);
    }
}