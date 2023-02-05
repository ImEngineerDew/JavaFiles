import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.print("Write the lengths of arrays: ");
        int length = object.nextInt();
        int i, j;

        Integer[] vectorA = new Integer[length];
        Integer[] vectorB = new Integer[vectorA.length];
        Integer[] resultVector = new Integer[vectorA.length];

        StringBuffer vecA = new StringBuffer();
        StringBuffer vecB = new StringBuffer();
        StringBuffer resV = new StringBuffer();

        System.out.println(" ");
        for (i = 0; i < vectorA.length; i++) {
            System.out.print("Write the values of vector A: ");
            vectorA[i] = object.nextInt();
        }
        System.out.println(" ");
        for (i = 0; i < vectorB.length; i++) {
            System.out.print("Write the values of vector B: ");
            vectorB[i] = object.nextInt();
        }
        System.out.println(" ");
        for (int n = 0; n < resultVector.length; n++) {
            resultVector[n] = vectorA[n] + vectorB[n];
            //System.out.print(" " + resultVector[n]);
        }
        System.out.println(" ");

        for (j = 0; j < vectorA.length; j++) {
            vecA.append(vectorA[j]).append(" ");
        }
        for (int k = 0; k < vectorB.length; k++) {
            vecB.append(vectorB[k]).append(" ");
        }
        for (int l = 0; l < resultVector.length; l++) {
            resV.append(resultVector[l]).append(" ");
        }
        System.out.println(" ");
        System.out.println("Values of vector A: " + vecA);
        System.out.println("Values of vector B: " + vecB);
        System.out.println("Values added: " + resV);
    }
}