import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        System.out.println("Please write the number to split: ");
        int num = object.nextInt();
        int result [] = new int[3];

        String number = String.valueOf(num);
        int i;

        for(i=0; i< number.length(); i++)
        {
            int j = Character.digit(number.charAt(i),10);
            result[j]+=j;
            System.out.print(result[j]);
        }
        //System.out.println(Arrays.toString(number));
    }
}