import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Integer lengthArray(int amount) {
        return amount;
    }

    public static void main(String[] args) {
        Main amountVec = new Main();
        Scanner object = new Scanner(System.in);

        System.out.print("Please write the length of array: ");
        int valueArray = object.nextInt();

        int val = amountVec.lengthArray(valueArray);

        int i, j = 0;

        Integer[] valA = new Integer[val];
        Integer[] valB = new Integer[valA.length];
        Integer[] resV = new Integer[valA.length];

        StringBuffer sorted = new StringBuffer();

        for (i = 0; i < valA.length; i++) {
            System.out.print("Write the values of A: ");
            valA[i] = object.nextInt();
        }
        System.out.println();
        for (i = 0; i < valB.length; i++) {
            System.out.print("Write the values of B: ");
            valB[i] = object.nextInt();

            if (valA[i] < valB[i]) {
                //System.out.println("The value is minor");
                resV[i] = valA[i];
            } else if (valA[i] > valB[i]) {
                //System.out.println("The value is major");
                resV[i] = valB[i];
            }
        }
        System.out.println(" ");
        Arrays.sort(resV);

        for (int k = 0; k < resV.length; k++) {
            sorted.append(resV[k]).append(" ");
        }
        System.out.println("Result numbers: " + sorted);
    }
}