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
            System.out.println("0. Exit the app!");
            System.out.println("1. Create an ArrayList");
            System.out.println("2. Show your ArrayList");
            System.out.println("3. Remove a specific Array");

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
                    System.out.println("Write any text: ");
                    for (int i = 0; i < textLimit; i++)
                    {
                        String cadena = object.nextLine();
                        cadena2.add(cadena);
                    }
                    break;

                case 2:
                    for(String newTrack: cadena2)
                    {
                        System.out.println(newTrack);
                    }
                    break;

                case 3:
                    System.out.println("What string do you want to remove: ");
                    int removeArray = object.nextInt();
                    cadena2.remove(removeArray);
                    break;
            }
        } while (!isFinished);
    }
}
