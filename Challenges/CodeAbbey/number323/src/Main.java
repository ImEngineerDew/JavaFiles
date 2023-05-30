import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(long nValue) {
        String numberStr = String.valueOf(nValue);
        String isPal = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(isPal);
    }

    public static Long nextPalindrome(Long number) {
        for (long nextPal = number + 1; ; nextPal++) {
            if (isPalindrome(nextPal)) {
                return nextPal - number;
            }
        }
    }

    public static void readVector(long[] vector, Scanner sc, int index) {
        if (index == vector.length) {
            return;
        }
        vector[index] = sc.nextLong();
        readVector(vector, sc, index + 1);
    }

    public static void showVector(long[] vector, int index) {
        if (index == vector.length) {
            return;
        }
        long result = nextPalindrome(vector[index]);
        System.out.print(result + " ");
        showVector(vector, index + 1);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the size of your array: ");
        int size = scanner.nextInt();

        long[] vector = new long[size];
        readVector(vector, scanner, 0);
        showVector(vector, 0);
    }
}