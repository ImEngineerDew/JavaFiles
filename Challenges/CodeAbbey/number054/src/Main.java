import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner object = new Scanner(System.in);

    System.out.print("Write the size of your array: ");
    Integer size = object.nextInt();

    Integer vector[] = new Integer[size];

    Integer s = 0;
    Integer a = 0, b = 0, c = 0;

    for (int i = 0; i < vector.length; i++) {
      System.out.print("Write the number to calulate their squares: ");
      s = object.nextInt();
      vector[i] = s;
    }

    for (a = 1; a < s; a++) {
      for (b = a + 1; b < s; b++) {
        c= (int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if(a+b+c==s)
        {
          if(c>a && c>b && Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2))
          {
            System.out.println(Math.pow(c,2));
          }
        }
      }
    }
  }
}
