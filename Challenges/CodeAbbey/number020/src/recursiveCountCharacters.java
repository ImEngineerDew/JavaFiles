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

    compareChar(vectorString,charCounter,objeto,index);
  }

  public static void compareChar(String vec[],Integer cnt[], Scanner sc, int k) {
    char aWord = 'a';
    char eWord = 'e';
    char iWord = 'i';
    char oWord = 'o';
    char uWord = 'u';

    System.out.println("Please write your quote: ");
    String qt = sc.nextLine();

    String quoteToLow = qt.toLowerCase();
    int counter = 0;

    if (k == quoteToLow.length()) {
      return;
    }
    compareChar(vec,cnt,sc,k+1);
    if (quoteToLow.charAt(k) == aWord) {
      counter++;
    } else if (quoteToLow.charAt(k) == eWord) {
      counter++;
    } else if (quoteToLow.charAt(k) == iWord) {
      counter++;
    } else if (quoteToLow.charAt(k) == oWord) {
      counter++;
    } else if (quoteToLow.charAt(k) == uWord) {
      counter++;
    }
    cnt[k] = counter;
  }
}