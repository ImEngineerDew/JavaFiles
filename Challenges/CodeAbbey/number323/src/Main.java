import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(Integer nValue) {
        String numberStr = String.valueOf(nValue);
        String isPal = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(isPal);
    }

    public static int nextPalindrome(int number, int nextPal) {
        if (isPalindrome(nextPal)) {
            return nextPal - number;
        } else {
            return nextPalindrome(number, nextPal + 1);
        }
    }

    public static void readVector(Long vector[], Scanner sc, Integer index) {
        if (index.equals(vector.length)) {
            return;
        }
        vector[index] = sc.nextLong();
        readVector(vector, sc, index + 1);
    }

    public static void showVector(Long vector[], Integer index) {
        if (index.equals(vector.length)) {
            return;
        }
        System.out.println(vector[index]);
        showVector(vector, index + 1);
    }
    public static void main (String args[])
    {
        Scanner object = new Scanner (System.in);
        System.out.print("Write the size of your array: ");
        int size = object.nextInt();

        Long vector [] = new Long[size];

        readVector(vector, object,0);
        showVector(vector,0);
    }
}