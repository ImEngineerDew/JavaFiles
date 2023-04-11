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
        char currentChar = answer.charAt(0);

        for (int i = 1; i < answer.length(); i++) {
            char nextChar = answer.charAt(i);
            if (currentChar == nextChar) {
                counter++;
            } else {
                stringBuilder.append(Integer.toBinaryString(counter));
                currentChar = nextChar;
                counter = 1;
            }
        }
        System.out.println(intToBin + " is equals to: " + answer);
        stringBuilder.append(Integer.toBinaryString(counter));
        System.out.println("Binary counted: "+stringBuilder);
    }
}