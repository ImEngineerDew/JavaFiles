import java.util.Scanner;
public class recursiveGCD
{
    public static void main(String args[])
    {
       Scanner object = new Scanner(System.in);
       Integer size = object.nextInt();

       Integer vector[] = new Integer[size];
       Integer valA[] = new Integer[vector.length];
       Integer valB[] = new Integer[vector.length];

       readVector(valA,object,0);
       readVector(valB,object,0);
    }

    public static void readVector(Integer vector[], Scanner sc, Integer index)
    {
        if(!index.equals(vector.length))
        {
           vector[index] = sc.nextInt();
           readVector(vector,sc,index+1);
        }
    }
    
}
