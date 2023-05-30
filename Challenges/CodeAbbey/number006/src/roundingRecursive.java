import java.util.Scanner;

public class roundingRecursive {
    public double divisionOperation(int a, int b) {
        return a / b;
    }

    public static void readVector(int vectorA[], int vectorB[], Scanner sc, Integer index) {
        if (index.equals(vectorA.length)) {
            return;
        }
        vectorA[index] = sc.nextInt();
        vectorB[index] = sc.nextInt();
        readVector(vectorA, vectorB, sc, index + 1);
    }
}
