import java.lang.Math;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        //Scanner object = new Scanner(System.in);
        int sizeArray = 6;
        int diceNumber = 0;
        double randomGen = 0.0;
        Integer arrayDice [] = new Integer[sizeArray];

        for(int i =0; i<sizeArray; i++)
        {
            randomGen = Math.random();
            diceNumber = (int)Math.round(randomGen*sizeArray);

            if(diceNumber>=1)
            {
                arrayDice[i] = diceNumber;
            }
            else if(diceNumber<=6)
            {
                arrayDice[i] = diceNumber;
            }
        }
        System.out.println("Random generated: "+randomGen);
        System.out.println("Pseudodice generated: "+ Arrays.toString(arrayDice));
    }
}