import java.util.Scanner;

public class roundingRecursive {
    static Scanner object = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Write the size of your array: ");
        int vectorSize = object.nextInt();

        Integer vA[] = new Integer[vectorSize];
        Integer vB[] = new Integer[vA.length];

        readVector(vA,vB,object,0);
    }
    public double divisionOperation(int a, int b) {
        return a / b;
    }

    public static void readVector(Integer vectorA[], Integer vectorB[], Scanner sc, Integer index) {
        if (index.equals(vectorA.length)) {
            return;
        }
        vectorA[index] = sc.nextInt();
        vectorB[index] = sc.nextInt();
        readVector(vectorA, vectorB, sc, index + 1);
    }

    public static void showResult(int vectorA[], int vectorB[], double vecDiv[], long rounded[], Integer index) {
        roundingRecursive division = new roundingRecursive();
        if (index.equals(vectorA.length)) {
            return;
        }
        vecDiv[index] = division.divisionOperation(vectorA[index], vectorB[index]);
        rounded[index] = Math.round(vecDiv[index]);
        showResult(vectorA, vectorB, vecDiv, rounded, index+1);
    }
}
