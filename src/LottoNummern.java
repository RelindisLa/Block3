import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class LottoNummern {
    public static void main(String[] args) {
        System.out.println("Unser Quicktipgenerator:");

        /*
        D 49
        Ö 46
        K 37
         */

        //System.out.println("Bitte " + tippanzahl + " für " + xaus + range);


       for (int tipps = 0; tipps < 3; tipps++) {

           for (int i = 0; i < 6; i++) {
               System.out.print(generateOneNumber(46) + ", ");
           }
           System.out.println();
       }

    }
   /* public static int calcInterest(int tippanzahl, int xaus, int range) {
        for (int tippanzahl = 0; tippanzahl <6; tippanzahl++){

        }

    }
        */
    public static int generateOneNumber (int range) {
        Random random = new Random();
        int randValue = random.nextInt();
        if (randValue < 0) {
            randValue = randValue * -1;
        }

        int value = (randValue % range) +1;

        return value;

    }
}
