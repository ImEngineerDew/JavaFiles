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
            System.out.println("0. Exit the app!");

            Integer option = object.nextInt();

            switch (option)
            {
                case 0:
                    System.out.println("Good bye!");
                    isFinished = true;
                    break;

                case 1:
                    cadena2.clear();                                                /*Blows up the previous array*/
                    System.out.println("Write the limit of objects to iterate: ");
                    Integer textLimit = object.nextInt();                           /*Determinate the quantity of spaces in an array*/

                    object.nextLine();
                    for (int i = 0; i < textLimit; i++)
                    {
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
