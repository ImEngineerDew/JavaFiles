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
    System.out.println("The GCD of "+firstNumber+","+secondNumber+","+thirdNumber+": "+GCTwo);
  }

  public static Integer commonGreaterDivisor(Integer a, Integer b) {
    if (b == 0) {
      return a;
    } else {
      return commonGreaterDivisor(b, a%b);
    }
  }
}