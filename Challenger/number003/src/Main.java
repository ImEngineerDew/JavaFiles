import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.print("Write the lengths of arrays: ");
        int length = object.nextInt();

        int resA = 0;
        int resB = 0;

        int i,j=0;

        Integer vectorA[] = new Integer[length];
        Integer vectorB[] = new Integer[length];
        Integer resultVector [] = new Integer[length];

        for(i=0; i<vectorA.length; i++)
        {
            System.out.print("Write the values of vector A: ");
            vectorA[i] = object.nextInt();
        }

        for(j=0; j<vectorB.length; j++)
        {
            System.out.print("Write the values of vector B: ");
            vectorB[j] = object.nextInt();
        }
        System.out.println();
        System.out.print("Values of vector A: ");
        System.out.println(Arrays.toString(vectorA));
        System.out.print("Values of vector B: ");
        System.out.println(Arrays.toString(vectorB));

        for(int k=0; k<vectorA.length;k++)
        {
            for(int l=0; l<vectorB.length;l++)
            {
                resultVector[l] = vectorA[i]+vectorB[j];
            }
        }
        System.out.println(Arrays.toString(resultVector));

        System.out.print("Values of vector B: ");
        System.out.println(Arrays.toString(vectorB));
    }
}