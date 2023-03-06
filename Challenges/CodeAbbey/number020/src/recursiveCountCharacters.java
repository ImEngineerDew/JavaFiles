import java.util.Scanner;

public class recursiveCountCharacters {
  public static void main(String[] args) {

    Scanner objeto = new Scanner(System.in);
    int index = 0;

    System.out.print("Write the size of array: ");
    Integer size = objeto.nextInt();

    objeto.nextLine();

    String vectorString[] = new String[size];
    Integer charCounter[] = new Integer[vectorString.length];

    readVectorString(vectorString, charCounter, index, objeto);
    countCharacters(charCounter, index);
  }

  public static void readVectorString(String vectorX[], Integer charCounter[], Integer index, Scanner object) {
    if (index == vectorX.length) {
      return;
    }
    Integer counter = 0;
    char aWord = 'a';
    char eWord = 'e';
    char iWord = 'i';
    char oWord = 'o';
    char uWord = 'u';

    String quote = object.nextLine();
    vectorX[index] = quote;

    for (int k = 0; k < quote.length(); k++) {
      if (quote.charAt(k) == aWord) {
        counter++;
      } else if (quote.charAt(k) == eWord) {
        counter++;
      } else if (quote.charAt(k) == iWord) {
        counter++;
      } else if (quote.charAt(k) == oWord) {
        counter++;
      } else if (quote.charAt(k) == uWord) {
        counter++;
      }
      charCounter[index] = counter;
    }
    readVectorString(vectorX, charCounter, index + 1, object);
  }

  /**
   * Recursive function that counts the number of vowels
   **/
  public static void countCharacters(Integer vector[], Integer index) {
    if (index == vector.length - 1) {
      System.out.print(vector[index] + " ");
    } else {
      System.out.print(vector[index] + " ");
      countCharacters(vector, index + 1);
    }
  }
}