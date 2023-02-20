import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.println("Write the size of an array: ");
        Integer size = object.nextInt();

        Integer number[] = new Integer[size];

        for(int i=0; i< number.length; i++)
        {
            number[i] = object.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }
}