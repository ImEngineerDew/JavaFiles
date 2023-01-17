import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.println("Write the lengths of arrays: ");
        int length = object.nextInt();

        int resA = 0;
        int resB = 0;

        Integer vectorA[] = new Integer[length];
        Integer vectorB[] = new Integer[length];

        for(int i=0; i<vectorA.length; i++)
        {
            vectorA[i] = object.nextInt();
        }
        System.out.print("Values of vector A: ");
        System.out.println(Arrays.toString(vectorA));
    }
}