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
        readArray(vectorA, pos, object);
        readArray(vectorB, pos, object);

        /** Show the arrays prior to sum **/
        showArray(vectorA, pos);
        showArray(vectorB, pos);
    }
    public static void showArray(Integer vector[], Integer i) {
        if (i.equals(vector.length - 1)) {
            //System.out.println("Position " + i + ": " + vector[i]);
            System.out.print(vector[i]+" ");
            System.out.println(" ");
        } else {
            //System.out.println("Position " + i + ": " + vector[i]);
            System.out.print(vector[i]+" ");
            showArray(vector, i + 1);
        }
    }
    public static void readArray(Integer vector[], Integer i, Scanner object) {
        if (i.equals(vector.length)) {
            return;
        }
        System.out.print("Write the numbers on the position " + i + ": ");
        vector[i] = object.nextInt();
        readArray(vector, i + 1, object);
    }
}
