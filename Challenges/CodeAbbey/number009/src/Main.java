import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int i;

        Integer[] triangle = new Integer[3];

        for (i = 0; i < triangle.length; i++) {
            System.out.print("Write the sides of triangle: ");
            triangle[i] = obj.nextInt();
            //sideC[i] = triangle[0]+triangle[1];
        }
        System.out.println(" ");
        System.out.println("Side A: " + triangle[0]);
        System.out.println("Side B: " + triangle[1]);
        System.out.println("Side C: " + triangle[2]);

        Integer condOne = triangle[0] + triangle[1];
        Integer condTwo = triangle[0] + triangle[2];
        Integer condThree = triangle[1] + triangle[2];

        if ((condOne) > triangle[2]) {
            System.out.println("It does pass the condition a+b>c");
        }
            if ((condTwo) > triangle[1]) {
                System.out.println("It does pass the condition a+c>b");
            }
                if ((condThree) > triangle[0]) {
                    System.out.println("It does pass the condition b+c>a");
                }
        }
    }
