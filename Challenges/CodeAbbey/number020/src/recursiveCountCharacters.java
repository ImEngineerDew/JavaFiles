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

    readVectorString(vectorString, index, objeto);
  }
  public static void readVectorString(String vectorX[], Integer i, Scanner object) {
    if (i == vectorX.length) {
      return;
    }
    System.out.println("Write your quote: ");
    vectorX[i] = object.nextLine();

    System.out.println(vectorX[i]);
    readVectorString(vectorX, i + 1, object);
  }
}
