import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuffer vector = new StringBuffer();
        Scanner object = new Scanner(System.in);
        Integer result = 0;

        System.out.print("Write the lengths of array: ");
        int length = object.nextInt();

        Integer[] array = new Integer[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Write the numbers: ");
            array[i] = object.nextInt();
            result += array[i];
        }
        for (int j = 0; j < array.length; j++) {
            vector.append(array[j]).append(" ");
        }
        System.out.println(" ");
        System.out.println("Numbers of array: " + vector);
        System.out.println("Result: " + result);
    }
}