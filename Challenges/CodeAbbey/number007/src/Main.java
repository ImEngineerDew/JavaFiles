import java.util.*;
import java.lang.*;

public class Main {
    public Double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;

        return celsius;
    }

    public static void main(String[] args) {
        int i;
        Scanner object = new Scanner(System.in);
        Main conversion = new Main();

        System.out.print("Write the amount of array: ");
        Integer value = object.nextInt();

        Double[] fahrenheit = new Double[value];
        Double[] celsius = new Double[fahrenheit.length];
        Long[] celsiusRounded = new Long[fahrenheit.length];

        StringBuffer rndC = new StringBuffer();

        for (i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = object.nextDouble();
            celsius[i] = conversion.fahrenheitToCelsius(fahrenheit[i]);
            celsiusRounded[i] = Math.round(celsius[i]);
        }

        for (int j = 0; j < celsiusRounded.length; j++) {
            rndC.append(celsiusRounded[j]).append(" ");
        }

        System.out.println("Fahrenheit degrees :" + Arrays.toString(fahrenheit));
        System.out.print("Celsius degrees: " + rndC);
    }
}