import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.println("Please write the size of your array: ");
        Integer size = object.nextInt();

        BigInteger isPrime[] = new BigInteger[size];

    }
    public static boolean isPrime(BigInteger num)
    {
        if(num==BigInteger.ZERO||num==BigInteger.ONE||num==BigInteger.valueOf(4))
        {
            return false;
        }
        for(int i=2; i<num/2;i++)
        {

        }
    }
}