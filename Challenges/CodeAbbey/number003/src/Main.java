import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner object = new Scanner(System.in);
        int pos = 0;

        System.out.println("Write the size of vector: ");
        Integer size = object.nextInt();

        /** Define the array and its size **/
        Integer vectorA[] = new Integer[size];
        readArray(vectorA,pos,object);

        /** Show the arrays prior to sum **/
        showArray(vectorA,pos);
    }
    public static void showArray(Integer vector[], Integer i) {
        if(i.equals(vector.length-1)) {
            System.out.print(vector[i]+" ");
        }
        else{
            System.out.print(vector[i]+" ");
            showArray(vector,i+1);
        }
    }
    public static void readArray(Integer vector[],Integer i, Scanner object)
    {
        if(i.equals(vector.length)) {
            return;
        }
            System.out.print("Write the numbers of the array: ");
            vector[i] = object.nextInt();
            readArray(vector,i+1,object);
    }
    public static int sumArray(Integer vectorA[],Integer vectorB[],Integer i)
    {
        if(i.equals(vectorA.length-1) || i.equals(vectorB.length-1))
        {
             return 0;
        }
        else {
            int res = vectorA[i]+vectorB[i];
            System.out.println(res);
            return res +sumArray(vectorA,vectorB,i+1);
        }
    }
}