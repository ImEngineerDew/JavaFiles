import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
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
        }
        System.out.print("Values of A: "+Arrays.toString(vecA));
        System.out.print("Values of B: "+Arrays.toString(vecB));
        System.out.print("Values of C: "+Arrays.toString(vecC));
    }
}