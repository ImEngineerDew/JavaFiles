import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner object = new Scanner(System.in);
        int pos = 0;

        //System.out.println("Write the size of vector: ");
        int size = object.nextInt();

        /** Define the array and its size **/
        Integer vectorA[] = new Integer[size];
        Integer vectorB[] = new Integer[size];
        Integer vectorR[] = new Integer[size];

        /** read the arrays with Scanner object **/
        readArray(vectorA, vectorB, pos, object);

        /** Show the arrays prior to sum **/
        showArray(vectorA,vectorB, pos);

        for (int i = 0; i < vectorR.length; i++) {
            vectorR[i] = vectorA[i] + vectorB[i];
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(vectorR));
    }
    public static void showArray(Integer vectorA[], Integer vectorB[], Integer i) {
        if (i.equals(vectorA.length - 1) || i.equals(vectorB.length - 1)) {
            System.out.print(vectorA[i] + " ");
            System.out.print(vectorB[i] + " ");
        } else {
            System.out.print(vectorA[i] + " ");
            System.out.print(vectorB[i] + " ");
            showArray(vectorA, vectorB, i + 1);
        }
    }

    public static void readArray(Integer vectorA[], Integer vectorB[], Integer i, Scanner object) {
        if (i.equals(vectorA.length) || i.equals(vectorB.length)) {
            return;
        }
        vectorA[i] = object.nextInt();
        vectorB[i] = object.nextInt();
        readArray(vectorA, vectorB, i + 1, object);
    }
}