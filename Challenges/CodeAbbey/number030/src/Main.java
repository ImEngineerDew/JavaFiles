import java.util.Scanner;
public class Main {
  public static void main(String[] args)
  {
    Scanner object = new Scanner(System.in);
    String text = object.nextLine();
    String newBackwards = " ";

    StringBuilder backwards = new StringBuilder(text);
    backwards.reverse();

    for(int index = text.length() - 1; index>=0; index--)
    {
      newBackwards+=text.charAt(index);
    }

    System.out.println("Original: "+text);
    System.out.println("Flipped with reverse method: "+backwards);
    System.out.println("Flipped with for cycle: "+newBackwards);
  }
}