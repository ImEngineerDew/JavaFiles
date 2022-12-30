import java.util.Scanner;

public class Main {

    public String textMessage(String message)
    {
        return message;
    }
    public static void main(String[] args)
    {
        Main newMessage = new Main();
        Scanner object = new Scanner(System.in);

        System.out.println("Write here: ");
        String text = object.nextLine();

        System.out.println(newMessage.textMessage(text));



    }
}