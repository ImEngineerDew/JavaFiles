import java.util.Scanner;

public class Main {

    public Integer aritmethicResult(int a, int b)
    {
        return a+b;
    }
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.print("Value of A: ");
        int valA = object.nextInt();

        System.out.print("Value of B: ");
        int valB = object.nextInt();

        Main resultado = new Main();
        System.out.print(valA+"+"+valB);
        System.out.println("="+resultado.aritmethicResult(valA, valB));
    }
}