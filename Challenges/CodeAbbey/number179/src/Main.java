import java.util.Scanner;
public class Main {

    public static String integerToBinary (int value)
    {
        return Integer.toBinaryString(value);
    }
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        int intToBin = object.nextInt();

        int stringLongitude = 1;

        String answer = integerToBinary(intToBin);
        System.out.println(intToBin+" is equals to: "+answer);
        System.out.println("Length of this binary: "+answer.length());

        for(int i=0; i<answer.length();i+=stringLongitude)
        {
            String segment = answer.substring(i,i+stringLongitude);
            System.out.println("Binary splited #"+i+":"+segment);
        }
    }
}