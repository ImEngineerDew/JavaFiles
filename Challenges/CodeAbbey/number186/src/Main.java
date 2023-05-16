import java.util.Scanner;

public class Main {
  private static Scanner object = new Scanner(System.in);

  public static void main(String[] args) {

    int quantity = Integer.parseInt(object.nextLine());
    simples(quantity, 0);
  }

  public static void simples(int quantity, int index) {
    float width = 480;  //pixels
    float height = 360; //pixels
    double scrDistant = 0.5; //This is the distance
    double scrWidth = 0.4; // This is the width
    double scrHeight = 0.3; // This is the height
    double eY = 1.0;

    if (index < quantity) {
      String tokens[] = object.nextLine().split("\\s+");
      float valueOfX = Float.parseFloat(tokens[0]);
      float valueOfY = Float.parseFloat(tokens[1]);
      float valueOfH = Float.parseFloat(tokens[2]);

      double valueOfK = scrDistant / valueOfX;
      double sX = -valueOfY * valueOfK;
      double sY = -eY * valueOfK;
      double sH = valueOfH * valueOfK;

      double resOfX = (sX + (scrWidth / 2)) * (width / scrWidth);
      System.out.printf("%d ", Math.round(resOfX));
      double resOfY = ((scrHeight / 2) - sY) * (height / scrHeight);
      System.out.printf("%d ", Math.round(resOfY));
      double resOfH = ((scrHeight / 2) - sY - sH) * (height / scrHeight);
      System.out.printf("%d ", Math.round(resOfH));

      simples(quantity, index + 1);
    }
  }
}