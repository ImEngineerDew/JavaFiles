import java.util.*;

public class Main
{
    public Double fahrenheitToCelsius(double fahrenheit,double celsius)
    {
        celsius = (fahrenheit - 32)/1.8;

        return celsius;
    }
    public static void main(String[] args)
    {
        int i;
        Scanner object = new Scanner(System.in);
        Main conversion = new Main();

        System.out.print("Write the amount of array: ");
        Integer value = object.nextInt();

        Double fahrenheit[] = new Double[value];
        Double celsius[] = new Double[fahrenheit.length];

        for(i=0; i< fahrenheit.length;i++)
        {
            fahrenheit[i] = object.nextDouble();

        }
    }
}