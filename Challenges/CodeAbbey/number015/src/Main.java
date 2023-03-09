import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args)
    {
        int array[] = new int [300];
        int maxVal = array[0];
        int minVal = array[0];
        int i;

        for(i = 1; i<array.length;i++)
        {
            array[i] = (int) (Math.random()*300);
            if(maxVal<array[i])
            {
                maxVal = array[i];
            }
            else if(minVal>array[i])
            {
                minVal = array[i];
            }
        }
        System.out.println("Generated numbers: "+Arrays.toString(array));
        System.out.println("Max val: "+maxVal);
        System.out.println("Min val: "+minVal);
    }
}