import java.util.Scanner;
public class Main {

    public static String integerToBinary (int value)
    {
        return Integer.toBinaryString(value);
    }
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        int intToBin = object.nextInt();

        String answer = integerToBinary(intToBin);
        System.out.println(intToBin+" is equals to: "+answer);
    }
}