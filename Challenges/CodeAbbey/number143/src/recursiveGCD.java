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

       readVector(valA,valB,object,0);
       showVector(valA,valB,0);
    }

    public static void readVector(Integer vector[],Integer vectorB[], Scanner sc, Integer index)
    {
        if(!index.equals(vector.length))
        {
           System.out.print("Write the values of vector A: ");
           vector[index] = sc.nextInt();

           System.out.print("Write the values of vector B: ");
           vectorB[index] = sc.nextInt();
           readVector(vector,vectorB,sc,index+1);
        }
    }

    public static void showVector(Integer vector[],Integer vectorB[], Integer index)
    {
       if(!index.equals(vector.length)) {
         System.out.println(vector[index]+" "+vectorB[index]);
         showVector(vector, vectorB,index + 1);
       }
    }
}