import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.print("Please write the length of array: ");
        int valueArray = object.nextInt();

        int i, j = 0;

        Integer valA[] = new Integer[valueArray];
        Integer valB[] = new Integer [valA.length];
        Integer resV[] = new Integer[valA.length];

        for(i=0; i< valA.length; i++)
        {
            System.out.print("Write the values of A: ");
            valA[i] = object.nextInt();

            System.out.print("Write the values of B: ");
            valB[i] = object.nextInt();
        }


    }
}