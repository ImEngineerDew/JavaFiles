import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner object = new Scanner(System.in);
    int s = object.nextInt();

    for (int a = 1; a < s; a++) {
      for (int b = a + 1; b < s; b++) {
        int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (a + b + c == s) {
          System.out.println(a + " " + b + " " + c);
        }
      }
    }
  }
}