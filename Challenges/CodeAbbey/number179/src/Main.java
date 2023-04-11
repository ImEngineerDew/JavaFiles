import java.util.Scanner;

public class Main {

    public static String integerToBinary(int value) {
        return Integer.toBinaryString(value);
    }
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        int intToBin = object.nextInt();
        String answer = integerToBinary(intToBin);

        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;

        System.out.println(intToBin + " is equals to: " + answer);
        System.out.println("Length of this binary: " + answer.length());
    }
}