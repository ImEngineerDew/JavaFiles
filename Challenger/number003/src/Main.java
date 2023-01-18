import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.print("Write the lengths of arrays: ");
        int length = object.nextInt();
        int i,j;

        Integer vectorA[] = new Integer[length];
        Integer vectorB[] = new Integer[vectorA.length];
        Integer resultVector [] = new Integer[vectorA.length];

        for(i=0; i<vectorA.length; i++)
        {
            System.out.print("Write the values of vector A: ");
            vectorA[i] = object.nextInt();

            System.out.print("Write the values of vector B: ");
            vectorB[i] = object.nextInt();
        }

        System.out.println();
        System.out.print("Values of vector A: ");
        System.out.println(Arrays.toString(vectorA));
        System.out.print("Values of vector B: ");
        System.out.println(Arrays.toString(vectorB));
        System.out.print("Values added: ");

        for(j=0; j<resultVector.length;j++)
        {
            resultVector[j] = vectorA[j]+vectorB[j];
            System.out.print(" "+resultVector[j]);
        }
        /**
         This is a comment code
        for(j=0; j<vectorB.length; j++)
        {
            System.out.print("Write the values of vector B: ");
            vectorB[j] = object.nextInt();
        }

        for(int k=0; k<resultVector.length;k++)
        {
            resultVector[k]= vectorA[k]+vectorB[k];
        }
         **/
     }
}