import java.util.Scanner;

public class Main {

    public static String integerToBinary(int value) {
        return Integer.toBinaryString(value);
    }

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        int intToBin = object.nextInt();

        int zerosCount = 0;
        int onesCount = 0;

        String answer = integerToBinary(intToBin);
        System.out.println(intToBin + " is equals to: " + answer);
        System.out.println("Length of this binary: " + answer.length());

        /** This code line can count the ones and zeros of whole binary number **/
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '1') {
                onesCount++;
            }
        }
        System.out.println("Ones count: "+onesCount);
    }
}