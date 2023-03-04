import java.util.Scanner;

public class recursiveCountCharacters {

  static char aWord = 'a';
  static char eWord = 'e';
  static char iWord = 'i';
  static char oWord = 'o';
  static char uWord = 'u';

  public static void main(String[] args) {


    Scanner objeto = new Scanner(System.in);
    int index = 0;

    System.out.println("Write the size of array: ");
    Integer size = objeto.nextInt();

    String frase = "";

    objeto.nextLine();

    String vectorString[] = new String[size];
    Integer charCounter[] = new Integer[vectorString.length];

    readVectorString(vectorString, frase, index, objeto);
  }

  public static void readVectorString(String vectorX[], String quote, Integer index, Scanner object) {
    if (index.equals(vectorX.length)) {
      return;
    }
    quote = object.nextLine();

    readVectorString(vectorX, quote, index + 1, object);
  }

  public static void showVectorString(String vectorX[], Integer index) {
    if (index.equals(vectorX.length - 1)) {
      System.out.println(vectorX[index]);
    } else {
      System.out.println(vectorX[index]);
      showVectorString(vectorX, index + 1);
    }
  }
}
