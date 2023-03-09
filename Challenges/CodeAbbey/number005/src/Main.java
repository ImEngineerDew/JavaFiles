import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.print("Write the amount of array: ");
        int value = object.nextInt();
        int i;

        Integer[] vecA = new Integer[value];
        Integer[] vecB = new Integer[vecA.length];
        Integer[] vecC = new Integer[vecA.length];

        Integer[] vecX = new Integer[vecA.length];

        StringBuffer vectorA = new StringBuffer();
        StringBuffer vectorB = new StringBuffer();
        StringBuffer vectorC = new StringBuffer();
        StringBuffer vectorX = new StringBuffer();

        System.out.println(" ");
        for (i = 0; i < vecA.length; i++) {
            System.out.print("Write the values of A: ");
            vecA[i] = object.nextInt();
        }
        System.out.println(" ");
        for (i = 0; i < vecB.length; i++) {
            System.out.print("Write the values of B: ");
            vecB[i] = object.nextInt();
        }
        System.out.println(" ");
        for (i = 0; i < vecC.length; i++) {
            System.out.print("Write the values of C: ");
            vecC[i] = object.nextInt();

            if (vecA[i] < vecB[i]) {
                if (vecA[i] < vecC[i]) {
                    vecX[i] = vecA[i];
                } else {
                    vecX[i] = vecC[i];
                }
            } else {
                if (vecB[i] < vecC[i]) {
                    vecX[i] = vecB[i];
                } else {
                    vecX[i] = vecC[i];
                }
            }
        }

        for (int j = 0; j < vecA.length; j++) {
            vectorA.append(vecA[j]).append(" ");
        }
        for (int k = 0; k < vecB.length; k++) {
            vectorB.append(vecB[k]).append(" ");
        }
        for (int l = 0; l < vecC.length; l++) {
            vectorC.append(vecC[l]).append(" ");
        }
        for (int m = 0; m < vecX.length; m++) {
            vectorX.append(vecX[m]).append(" ");
        }

        System.out.println(" ");
        System.out.println("Values of A: " + vectorA);
        System.out.println("Values of B: " + vectorB);
        System.out.println("Values of C: " + vectorC);
        System.out.println("Values split: " + vectorX);
    }
}