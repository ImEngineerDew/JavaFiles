import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main (String args[]) {
        ArrayList<String> cadena2 = new ArrayList<>();
        Scanner object = new Scanner(System.in);

        boolean isFinished = false;

        /**::::::::::::::::::::::::::::::::::::::::::::::::::::::::::**/
        do {
            System.out.println("ArrayList manipulator");
            System.out.println("1. Create an ArrayList");
            System.out.println("2. Show your ArrayList");

            Integer option = object.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Write the limit of objects to iterate: ");
                    Integer textLimit = object.nextInt();

                    object.nextLine();
                    for (int i = 0; i < textLimit; i++) {
                        System.out.println("Write any text: ");
                        String cadena = object.nextLine();
                        cadena2.add(cadena);
                    }
                    break;

                case 2:
                    System.out.println(cadena2.toString());
                    break;
            }
        } while (!isFinished);
    }
}
