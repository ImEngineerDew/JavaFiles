import java.util.Scanner;

public class Main {
    static Scanner object = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void readStr(String vecA[], Scanner sc, Integer index) {
        if (index.equals(vecA.length)) {
            return;
        }
        System.out.println("Please write the next quotes: ");
        vecA[index] = sc.nextLine();
        readStr(vecA, sc, index + 1);
    }
}