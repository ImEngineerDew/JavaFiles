import java.util.Scanner;

public class Main {

    public Integer resultSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

        Main tri = new Main();
        Scanner obj = new Scanner(System.in);
        int answer = 0;
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

        Integer condOne = tri.resultSum(triangle[0], triangle[1]);
        Integer condTwo = tri.resultSum(triangle[0],triangle[2]);
        Integer condThree = tri.resultSum(triangle[2],triangle[3]);

        /**Blank space**/
    }
}
