import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner object = new Scanner(System.in);

    System.out.println("Write the first number: ");
    Integer firstNumber = object.nextInt();

    System.out.println("Write the second number: ");
    Integer secondNumber = object.nextInt();

    System.out.println("Write the third number: ");
    Integer thirdNumber = object.nextInt();

    Integer GCDone = commonGreaterNumber(firstNumber, secondNumber);
    Integer GCTwo = commonGreaterNumber(GCDone,thirdNumber);
    System.out.println(GCTWO);
  }

  public static Integer commonGreaterNumber(Integer a, Integer b) {
    int result = 0;
    if (a > b)
    {
      result = a % b;
    } else if (a < b)
    {
      result =  b%a;
    }
    return result;
  }
}