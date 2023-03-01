import java.util.Scanner;

public class Recorrer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Leer los elementos del array usando Scanner
        leerArray(array, 0, scanner);

        // Recorrer el array usando recursividad
        recorrerArray(array, 0);
    }

    public static void leerArray(int[] array, int index, Scanner scanner) {
        if (index == array.length) {
            return;
        }

        System.out.print("Ingrese el elemento " + index + ": ");
        array[index] = scanner.nextInt();

        leerArray(array, index + 1, scanner);
    }

    public static void recorrerArray(int[] array, int index) {
        if (array.length == 0 || index == array.length) {
            return;
        }

        System.out.println(array[index]);

        recorrerArray(array, index + 1);
    }

}
