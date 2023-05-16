import java.util.Scanner;
import java.math.*;

public class Main {
  private static Scanner object = new Scanner(System.in);

  public static void main(String[] args) {
    Integer length = Integer.parseInt(object.nextLine());

    String tokens[] = object.nextLine().split("\\s+");
    Integer playX = Integer.parseInt(tokens[0]);
    Integer playY = Integer.parseInt(tokens[1]);
    Double angles = Double.parseDouble(tokens[2]);
    coordinates(length, 1, playX, playY, angles);
  }

  public static void coordinates(int length, int acum, int pX, int pY, double ang) {
    if (acum <= length) {
      String tokens[] = object.nextLine().split("\\s+");
      int xI = Integer.parseInt(tokens[0]);
      int yI = Integer.parseInt(tokens[1]);

      double max = (2 * Math.PI) + Math.atan(0.2 / 0.5);
      double min = (2 * Math.PI) - Math.atan(0.2 / 0.5);

      double posX = Math.cos(ang) * (xI - pX) + Math.sin(ang) * (yI - pY);
      double posY = Math.cos(ang) * (yI - pY) + (-Math.sin(ang)) * (xI - pX);

      double hype = Math.sqrt(Math.pow(posX, 2) + Math.pow(posY, 2));
      double beta = Math.abs(Math.atan(posY / posX));
      double quad = 0;

      int soFar = 60;

      if (posX < 0 && posY > posX) {
        quad = beta - Math.PI;
      }
      if (posX < 0 && posY < 0) {
        quad = beta + Math.PI;
      }
      if (posX > 0 && posY < 0) {
        quad = (Math.PI * 2) - beta;
      }
      if (posX > 0 && posY > 0) {
        quad = (Math.PI * 2) + beta;
      }
      if (hype < soFar && quad > min && quad < max) {
        System.out.print(posX + "  ");
        System.out.print(posY + "  ");
      }
      coordinates(length, acum + 1, pX, pY, ang);
    }
  }
}
