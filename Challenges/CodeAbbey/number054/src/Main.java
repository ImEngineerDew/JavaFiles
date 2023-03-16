import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner object = new Scanner(System.in);

    System.out.println("Write the size of your array: ");
    Integer size = object.nextInt();

    Integer vector[] = new Integer[size];

    Integer s = 0;

    for(int i=0;i<vector.length;i++)
    {
      System.out.println("Write the number to calulate their squares: ");
      s = object.nextInt();
      vector[i] = s;

      
    }

    System.out.println(Arrays.toString(vector));
  }


}
