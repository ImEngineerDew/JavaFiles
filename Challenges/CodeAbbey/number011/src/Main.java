import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Please write the number to split: ");
        int num = object.nextInt();

        String number = String.valueOf(num);
        int i;

        for(i=0; i< number.length(); i++)
        {
            int j = Character.digit(number.charAt(i),10);
            System.out.println("Number splitted : "+j);
        }
        //System.out.println(Arrays.toString(number));
    }
}