import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Write the size of your array: ");
    Integer size = input.nextInt();

    Long pythagorean[] = new Long[size];

    long s = input.nextInt();

    for(int i=0; i<pythagorean.length; i++) {
      pythagorean[size] = s;
    }

    for (int m = 2; m <= Math.sqrt(s); m++) {
      for (int n = 1; n < m; n++) {
        int a = (int)Math.pow(m,2) - n * n;
        int b = 2 * m * n;
        int c =((int)Math.pow(m,2)) + ((int)Math.pow(n,2));

        if (a + b + c == s) {
          System.out.println(a + " " + b + " " + c);
          System.out.println("Value of c^2: "+(int)Math.pow(c,2));
        }
      }
    }
  }
  }

    /**
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
     **/
