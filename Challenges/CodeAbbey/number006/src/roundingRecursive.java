import java.util.Scanner;

public class roundingRecursive {
    static Scanner object = new Scanner(System.in);
    public static void main(String args[])
    {
        //System.out.print("Write the size of your array: ");
        int vectorSize = object.nextInt();

        Integer vA[] = new Integer[vectorSize];
        Integer vB[] = new Integer[vA.length];
        Double  divisor [] = new Double[vA.length];
        Long rounded [] = new Long [vA.length];

        readVector(vA,vB,object,0);
        showResult(vA,vB,divisor,rounded,0);
    }
    public Double divisionOperation(int a, int b) {
        return (double)a / b;
    }

    public static void readVector(Integer vectorA[], Integer vectorB[], Scanner sc, Integer index) {
        if (index.equals(vectorA.length)) {
            return;
        }
        //System.out.print("Please write the value of a: ");
        vectorA[index] = sc.nextInt();

        //System.out.print("Please write the value of b: ");
        vectorB[index] = sc.nextInt();
        readVector(vectorA, vectorB, sc, index + 1);
    }

    public static void showResult(Integer vectorA[],Integer vectorB[], Double vecDiv[], Long rounded[], Integer index) {
        roundingRecursive division = new roundingRecursive();
        if (index.equals(vectorA.length)) {
            return;
        }
        vecDiv[index] = division.divisionOperation(vectorA[index], vectorB[index]);
        rounded[index] = Math.round(vecDiv[index]);
        System.out.println("Rounded: "+rounded[index]);
        showResult(vectorA, vectorB, vecDiv, rounded, index+1);
    }
}