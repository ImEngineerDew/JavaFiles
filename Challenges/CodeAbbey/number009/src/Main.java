import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Write the size of array: ");
        int size = obj.nextInt();
        int i;

        Long[] sideA = new Long[size];
        Long[] sideB = new Long[sideA.length];
        Long[] sideC = new Long[sideA.length];

        Long[] sum = new Long[sideA.length];

        for (i = 0; i < sideA.length; i++) {
            System.out.print("Write the side A of triangle: ");
            sideA[i] = obj.nextLong();
        }
        for (i = 0; i < sideB.length; i++) {
            System.out.print("Write the side B of triangle: ");
            sideB[i] = obj.nextLong();
        }
        for (i = 0; i < sideC.length; i++) {
            System.out.print("Write the side C of triangle: ");
            sideC[i] = obj.nextLong();
        }
        /**Triangle # 1**/
        int answer = 0;

        for (int k = 0; k < sum.length; k++) {
            if ((sideA[k] + sideB[k]) > sideC[k]) {
                if ((sideA[k] + sideC[k]) > sideB[k]) {
                    if ((sideB[k] + sideC[k]) > sideA[k]) {
                        System.out.print(answer + 1);
                    } else {
                        System.out.println(answer);
                    }
                } else {
                    System.out.println(answer);
                }
            } else {
                System.out.println(answer);
            }
        }
    }
}
