import java.util.Arrays;
import java.util.Scanner;

public class CountCharacters {
  public static void main(String[] args) {

    char aWord = 'a';
    char eWord = 'e';
    Scanner object = new Scanner(System.in);

    System.out.println("Write the size of array: ");
    Integer size = object.nextInt();

    object.nextLine();

    String vector[] = new String[size];
    Integer charCounter[] = new Integer[vector.length];

    for (int i = 0; i < vector.length; i++) {
      int counter = 0;
      System.out.println("Write your quote: ");
      String quote = object.nextLine();
      for (int k = 0; k < quote.length(); k++) {
        if (quote.charAt(k) == aWord) {
          counter++;
        }
        charCounter[i] = counter;
      }
      System.out.println(counter);
    }
    System.out.println(Arrays.toString(charCounter));
  }
}

