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
        Scanner object = new Scanner(System.in);

        System.out.print("Write the amount of array: ");
        Integer value = object.nextInt();

        Double fahrenheit[] = new Double[value];
        Double celsius[] = new Double[fahrenheit.length];
    }
}