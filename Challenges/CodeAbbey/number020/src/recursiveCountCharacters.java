import java.util.Scanner;

public class recursiveCountCharacters {
  public static void main(String[] args) {

    Scanner objeto = new Scanner(System.in);
    int index = 0;

    System.out.println("Write the size of array: ");
    Integer size = objeto.nextInt();

    objeto.nextLine();

    String vectorString[] = new String[size];
    Integer charCounter[] = new Integer[vectorString.length];

    readVectorString(vectorString, index, objeto);

    showVectorString(vectorString,index);
  }

  public static void readVectorString(String vectorX[], Integer index, Scanner object) {
    if (index== vectorX.length) {
      return;
    }
    String quote = object.nextLine();
    vectorX[index] = quote;

    readVectorString(vectorX,  index + 1, object);
  }

  public static void showVectorString(String vectorX[], Integer index) {
    if (index==vectorX.length - 1) {
      System.out.println(vectorX[index]);
    } else {
      System.out.println(vectorX[index]);
      showVectorString(vectorX, index + 1);
    }
  }
}