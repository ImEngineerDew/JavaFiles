import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner object = new Scanner(System.in);
        int pos = 0;

        System.out.println("Write the size of vector: ");
        int size = object.nextInt();

        /** Define the array and its size **/
        Integer vectorA[] = new Integer[size];
        Integer vectorB[] = new Integer[size];
        Integer vectorR[] = new Integer[size];
        readArray(vectorA,vectorB, pos, object);

        /** Show the arrays prior to sum **/
        showArrayA(vectorA, pos);
        showArrayB(vectorB, pos);

        for(int i = 0; i<vectorR.length;i++)
        {
            vectorR[i] =  vectorA[i]+vectorB[i];
        }
        System.out.println(Arrays.toString(vectorR));
    }
    public static void showArrayA(Integer vectorA[], Integer i) {
        if (i.equals(vectorA.length - 1)) {
            //System.out.println("Position " + i + ": " + vector[i]);
            System.out.print(vectorA[i]+" ");
            System.out.println(" ");
        } else {
            //System.out.println("Position " + i + ": " + vector[i]);
            System.out.print(vectorA[i]+" ");
            showArrayA(vectorA, i + 1);
        }
    }
    public static void showArrayB(Integer vectorB[], Integer i) {
        if (i.equals(vectorB.length - 1)) {
            //System.out.println("Position " + i + ": " + vector[i]);
            System.out.print(vectorB[i]+" ");
            System.out.println(" ");
        } else {
            //System.out.println("Position " + i + ": " + vector[i]);
            System.out.print(vectorB[i]+" ");
            showArrayA(vectorB, i + 1);
        }
    }
    public static void readArray(Integer vectorA[],Integer vectorB[], Integer i, Scanner object) {
        if (i.equals(vectorA.length) || i.equals(vectorB.length)) {
            return;
        }
        System.out.print("Write the numbers on the position " + i + "of vectorA: ");
        vectorA[i] = object.nextInt();
        System.out.print("Write the numbers on the position " + i + "of vectorB: ");
        vectorB[i] = object.nextInt();
        readArray(vectorA,vectorB, i + 1, object);
    }
}
