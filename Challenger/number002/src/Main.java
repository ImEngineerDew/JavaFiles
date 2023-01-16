import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        Integer result=0;

        System.out.println("Write the lengths of array: ");
        int length = object.nextInt();

        Integer array[] = new Integer[length];

        System.out.println("Write the numbers: ");
        for(int i=0; i<array.length; i++)
        {
            array[i] = object.nextInt();
            result += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }
}