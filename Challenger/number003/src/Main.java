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

        System.out.print("Write the values of vector A: ");
        for(int i=0; i<vectorA.length; i++)
        {
            vectorA[i] = object.nextInt();
        }
        System.out.print("Values of vector A: ");
        System.out.println(Arrays.toString(vectorA));

        System.out.println("Write the values of vector B: ");
        for(int j=0; j<vectorB.length; j++)
        {
            vectorB[j] = object.nextInt();
        }
        System.out.print("Values of vector B: ");
        System.out.println(Arrays.toString(vectorB));
    }
}