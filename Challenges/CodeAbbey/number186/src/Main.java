import java.util.Scanner;

public class Main {
  private static Scanner object = new Scanner(System.in);

  public static void main(String[] args) {

  }

  public static void simples(int quantity, int index) {
    float width = 480;  //pixels
    float height = 360; //pixels
    Double scrDistant = 0.5; //This is the distance
    Double scrWidth = 0.4; // This is the width
    Double scrHeight = 0.3; // This is the height
    Double eY = 0.1;

    if (index < quantity) {
      String tokens[] = object.nextLine().split("\\s+");
      Float valueOfX = Float.parseFloat(tokens[0]);
      Float valueOfY = Float.parseFloat(tokens[1]);
      Float valueOfH = Float.parseFloat(tokens[2]);

      Double valueOfK = scrDistant / valueOfX;
      Double sX = - valueOfY * valueOfK;
      Double sY = - eY * valueOfK;
    }

  }
}