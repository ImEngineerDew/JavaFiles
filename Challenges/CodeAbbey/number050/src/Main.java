import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        Integer size = object.nextInt();

        String vecA[] = new String[size+1];
        readStr(vecA, object, 0);
        showStr(vecA, 0);
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
        vecA[index] = sc.nextLine();
        readStr(vecA, sc, index + 1);
    }

    public static void showStr(String res[], Integer index) {
        if (index.equals(res.length)) {
            return;
        }
        String replace = res[index].replaceAll("[^a-zA-Z0-9]", "")
                                   .replaceAll("\\s","")
                                           .toLowerCase();
        String backwards = reverseString(replace);
        boolean isPalindrome = backwards.equals(replace);

        if (isPalindrome)
        {
            System.out.println("Original and fusion: " +replace);
            System.out.println("Flipped text: "+backwards);
            System.out.println("Y");
        }
        else
        {
            System.out.println("Original and fusion: " +replace);
            System.out.println("Flipped text: "+backwards);
            System.out.println("N");
        }
        showStr(res,  index + 1);
    }
}