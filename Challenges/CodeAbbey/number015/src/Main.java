import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args)
    {
        long array[] = new long[300];
        int i;

        for(i=1; i< array.length;i++) {
            array[i] = (int)(Math.random()*300+1);
        }
        System.out.println(Arrays.toString(array));
    }
}