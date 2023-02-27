import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        double randomGen = Math.random();
        int diceNumber = (int)Math.round(randomGen*6);


        System.out.println("Random generated: "+randomGen);
        System.out.println("Pseudodice generated: "+diceNumber);
    }
}