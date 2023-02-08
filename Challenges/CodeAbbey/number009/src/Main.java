import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Integer resultSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Main tri = new Main();
        Scanner obj = new Scanner(System.in);

        System.out.println("Write the size of array: ");
        int size = obj.nextInt();
        int answer = 0;
        int i;

        Integer sideA[] = new Integer[size];
        Integer sideB[] = new Integer[sideA.length];
        Integer sideC[] = new Integer[sideA.length];

        for (i = 0; i < sideA.length; i++) {
            System.out.print("Write the side A of triangle: ");
            sideA[i] = obj.nextInt();
        }
        for (i = 0; i < sideB.length; i++) {
            System.out.print("Write the side B of triangle: ");
            sideB[i] = obj.nextInt();
        }
        for (i = 0; i < sideA.length; i++) {
            System.out.print("Write the side C of triangle: ");
            sideC[i] = obj.nextInt();
        }

        StringBuffer A = new StringBuffer();
        StringBuffer B = new StringBuffer();
        StringBuffer C = new StringBuffer();

        for (int j = 0; j < sideA.length; j++) {
            A.append(sideA[j]).append(" ");
        }
        for (int k = 0; k < sideB.length; k++) {
            B.append(sideB[k]).append(" ");
        }
        for (int l = 0; l < sideC.length; l++) {
            C.append(sideC[l]).append(" ");
        }

        String a = A.toString();
        String b = B.toString();
        String c = C.toString();

    }
}