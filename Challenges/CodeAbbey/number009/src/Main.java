import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        //System.out.print("Write the size of array: ");
        //Integer size = obj.nextInt();
        int i;

        Integer triangle[] = new Integer[3];
        //Integer sideC[] = new Integer[triangle.length];

        for(i=0; i<triangle.length;i++) {
            System.out.print("Write the sides of triangle: ");
            triangle[i] = obj.nextInt();
            //sideC[i] = triangle[0]+triangle[1];
        }
        System.out.println(" ");
        System.out.println("Side A: "+triangle[0]);
        System.out.println("Side B: "+triangle[1]);
        System.out.println("Side C: "+triangle[2]);

        Integer condOne = triangle[0]+triangle[1];

        if((condOne)>triangle[2]) {
            System.out.println("It does pass the condition a+b>c");
        }
        else {
            System.out.println("It doesn't pass the condition a+b>c");
        }
        if((triangle[0]+triangle[2])>triangle[1]) {
            System.out.println("It does pass the condition a+c>b");
        }
        else {
            System.out.println("It doesn't pass the condition a+c>b");
        }
        if()
    }
}