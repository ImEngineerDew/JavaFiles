import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();
        ArrayList<Integer> arrayC = new ArrayList<>();

        ArrayList<Integer> arrayX = new ArrayList<>();

       
        /**
        System.out.print("Write the amount of array: ");
        int value = object.nextInt();
        int i;

        Integer vecA[] = new Integer[value];
        Integer vecB[] = new Integer[vecA.length];
        Integer vecC[] = new Integer[vecA.length];

        Integer vecX[] = new Integer[vecA.length];

        for(i=0;i<vecA.length;i++)
        {
            System.out.print("Write the values of A: ");
            vecA[i] = object.nextInt();

            System.out.print("Write the values of B: ");
            vecB[i] = object.nextInt();

            System.out.print("Write the values of C: ");
            vecC[i] = object.nextInt();

            if(vecA[i]<vecB[i])
            {
                if(vecA[i]<vecC[i])
                {
                    vecX[i] = vecA[i];
                }
                else
                {
                    vecX[i] = vecC[i];
                }
            }
            else if(vecB[i]<vecC[i])
            {
                vecX[i] = vecB[i];
            }
            else
            {
                vecX[i] = vecC[i];
            }
        }
        System.out.println("Values of A: "+Arrays.toString(vecA));
        System.out.println("Values of B: "+Arrays.toString(vecB));
        System.out.println("Values of C: "+Arrays.toString(vecC));
        System.out.println("Values split: "+Arrays.toString(vecX));

         **/
    }
}