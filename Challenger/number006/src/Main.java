import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
public class Main
{
    public Double divisorOperation(int a, int b)
    {
        return (double)a/b;
    }
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        int i;
        Main division = new Main();

        System.out.print("Write the amount of arrays: ");
        int valueArr = object.nextInt();

        Integer vectorA[] = new Integer[valueArr];
        Integer vectorB[] = new Integer[vectorA.length];
        Double vectorDiv[] = new Double[vectorA.length];

        for(i=0;i<vectorA.length;i++)
        {
            System.out.print("Write the values of vector A: ");
            vectorA[i] = object.nextInt();

            System.out.print("Write the values of vector B: ");
            vectorB[i] = object.nextInt();

            vectorDiv[i]= division.divisorOperation(vectorA[i],vectorB[i]);
        }
        System.out.println(Arrays.toString(vectorDiv));
    }
}