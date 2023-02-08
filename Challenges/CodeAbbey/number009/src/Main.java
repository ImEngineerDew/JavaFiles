import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Integer resultSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Main tri = new Main();
        Scanner obj = new Scanner(System.in);

        System.out.println("Write the size of array: ");
        int size = obj.nextInt();
        int answer = 0;
        int i;

        Integer sideA[] = new Integer[size];
        Integer sideB[] = new Integer[sideA.length];
        Integer sideC[] = new Integer[sideA.length];

        for (i = 0; i < sideA.length; i++) {
            System.out.print("Write the side A of triangle: ");
            sideA[i] = obj.nextInt();
        }
        for (i = 0; i < sideB.length; i++) {
            System.out.print("Write the side B of triangle: ");
            sideB[i] = obj.nextInt();
        }
        for (i = 0; i < sideA.length; i++) {
            System.out.print("Write the side C of triangle: ");
            sideC[i] = obj.nextInt();
        }
        System.out.println(" ");
        System.out.println("Side A: "+Arrays.toString(sideA));
        System.out.println("Side B: "+Arrays.toString(sideB));
        System.out.println("Side C: "+Arrays.toString(sideC));

        StringBuffer A = new StringBuffer();
        StringBuffer B = new StringBuffer();
        StringBuffer C = new StringBuffer();

        for(int j = 0; j<sideA.length;j++)
        {
            A.append(sideA[j]).append(" ");
        }
        for(int k = 0;k<sideB.length;k++)
        {
            B.append(sideB[k]).append(" ");
        }
        /** Sums a+b > c**/
        Integer caseA = tri.resultSum(sideA[i],sideB[i]);
        /** Sums if a+c > b **/
        Integer caseB = tri.resultSum(sideA[i],sideC[i]);
        /** Sums if b+c > a **/
        Integer caseC = tri.resultSum(sideB[i],sideC[i]);

        /** Evaluates the following cases**/
        if(caseA>sideC[i]){
            System.out.println(answer+1);
        }
        else
        {
            System.out.println(answer);
        }

        if(caseB>sideB[i])
        {
            System.out.println(answer+1);
        }
        else
        {
            System.out.println(answer);
        }
        if(caseC>sideA[i])
        {
            System.out.println(answer+1);
        }
        else
        {
            System.out.println(answer);
        }
    }
}