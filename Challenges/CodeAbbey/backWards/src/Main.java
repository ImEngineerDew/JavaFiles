import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);
    Integer numberBack = object.nextInt();

    Integer show = backwards(numberBack);
    System.out.print(show);
  }
  public static Integer backwards(int number)
  {
    if(number<10)
    {
      return number;
    }
    else
    {
      System.out.print(number%10);
      return backwards(number/10);
    }
  }
}