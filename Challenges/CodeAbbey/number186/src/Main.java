import java.util.Scanner;

public class Main {
  private static Scanner object = new Scanner(System.in);

  public static void main(String[] args) {

  }

  public static void simples(int quantity, int index) {
    float width = 480;  //pixels
    float height = 360; //pixels
    Double scrDistant = 0.5;
    Double scrWidth = 0.4;
    Double scrHeight = 0.3;
    Double eY = 0.1;

    if (index < quantity) {
      String tokens[] = object.nextLine().split("\\s+");
      Float valX = Float.parseFloat(tokens[0]);
      Float valY = Float.parseFloat(tokens[1]);
      Float valH = Float.parseFloat(tokens[2]);
    }

  }
}