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

    Integer GCDone = commonGreaterDivisor(firstNumber, secondNumber);
    Integer GCTwo = commonGreaterDivisor(GCDone, thirdNumber);
    System.out.println(GCTwo);
  }

  public static Integer commonGreaterDivisor(Integer a, Integer b) {
    if (a < b) {
      return b % a;
    } else if (b == 0) {
      return a;
    }
    return commonGreaterDivisor(b, a % b);
  }
}