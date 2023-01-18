import java.util.Scanner;
public class Main
{
    public Integer lengthArray(int amount)
    {
        return amount;
    }
    public static void main(String[] args)
    {
        Main amountVec = new Main();
        Scanner object = new Scanner(System.in);

        System.out.print("Please write the length of array: ");
        int valueArray = object.nextInt();

        int val = amountVec.lengthArray(valueArray);

        int i, j = 0;

        Integer valA[] = new Integer[val];
        Integer valB[] = new Integer [valA.length];
        Integer resV[] = new Integer[valA.length];

        for(i=0; i< valA.length; i++)
        {
            System.out.print("Write the values of A: ");
            valA[i] = object.nextInt();

            System.out.print("Write the values of B: ");
            valB[i] = object.nextInt();

            if(valA[i]<valB[i])
            {
                System.out.println("The value is minor");
                resV[i] = valA[i];
            }
            else if(valA[i]>valB[i])
            {
                System.out.println("The value is major");
                resV[i] = valB[i];
            }
        }
        System.out.print("Values compared: "+resV[i]);
    }
}