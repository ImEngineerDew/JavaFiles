import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.println("Write the lengths of array: ");
        int lenght = object.nextInt();

        Integer array[] = new Integer[lenght];

        System.out.println("Write the numbers: ");
        for(int i=0; i<array.length; i++)
        {
            array[i] = object.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}