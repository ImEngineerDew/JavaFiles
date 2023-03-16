import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner object = new Scanner(System.in);

    System.out.print("Write the size of your array: ");
    int size = object.nextInt();

    int vector[] = new int[size];

    for (int i = 0; i < vector.length; i++) {
      System.out.print("Write the number to calculate their squares: ");
      int s = object.nextInt();

      int cSquared = 0;
      for (int a = 1; a < s; a++) {
        for (int b = a + 1; b < s; b++) {
          int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
          if (a + b + c == s && c > a && c > b && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            cSquared = (int) Math.pow(c, 2);
          }
        }
      }
      vector[i] = cSquared;
    }

    System.out.println("Values of c squared:");
    for (int i = 0; i < vector.length; i++) {
      System.out.print(vector[i]+" ");
    }
  }
}