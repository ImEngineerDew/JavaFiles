import java.util.Scanner;
import java.util.*;

public class Main {
    public Double divisorOperation(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int i;
        Main division = new Main();

        System.out.print("Write the amount of arrays: ");
        int valueArr = object.nextInt();

        Integer[] vectorA = new Integer[valueArr];
        Integer[] vectorB = new Integer[vectorA.length];
        Long[] rounded = new Long[vectorA.length];
        Double[] vectorDiv = new Double[vectorA.length];

        System.out.println(" ");
        for (i = 0; i < vectorA.length; i++) {
            System.out.print("Write the values of vector A: ");
            vectorA[i] = object.nextInt();
        }
        System.out.println(" ");
        for (i = 0; i < vectorB.length; i++) {
            System.out.print("Write the values of vector B: ");
            vectorB[i] = object.nextInt();

            vectorDiv[i] = division.divisorOperation(vectorA[i], vectorB[i]);

            rounded[i] = Math.round(vectorDiv[i]);
        }

        StringBuffer rnd = new StringBuffer();

        for (int j = 0; j < rounded.length; j++) {
            rnd.append(rounded[j]).append(" ");
        }
        for(int k = 0; k<vectorDiv.length;k++){
            rnd.append(vectorDiv[k]).append(" ");
        }
        System.out.println(" ");
        System.out.println("Rounded: " + rnd);
        System.out.println("Not rounded: " + Arrays.toString(vectorDiv));
    }
}