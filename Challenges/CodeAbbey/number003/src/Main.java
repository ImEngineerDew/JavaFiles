import java.util.Scanner;
public class Main {

    public static void readArray(Integer array[], Integer i)
    {
        if(i == array.length-1)
        {
            System.out.print(array[i]);
        }
        else
        {
            System.out.print(array[i]);
            readArray(array,i+1);
        }
    }
    public static void writeArray(Integer array[],Integer i, Scanner object)
    {
        if(i == array.length)
        {
            return;
        }
        System.out.println("Write the elements of these vector: ");
            array[i] = object.nextInt();
            writeArray(array, i+1, object);
        }
    public static void main(String args[]) {

        Scanner object = new Scanner(System.in);

        System.out.print("Write the length of array: ");
        int value = object.nextInt();
        int i = 0;

       Integer vectorA[] = new Integer[value];
       Integer vectorB[] = new Integer[vectorA.length];

       writeArray(vectorA,0,object);
       writeArray(vectorB,0,object);

       readArray(vectorA,0);
       readArray(vectorB,0);
    }
}