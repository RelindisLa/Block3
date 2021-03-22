package Übungen_4;

public class VolkommeneZahlen {

    /*
    Vollkommene Zahlen sind die Summe ihrer echten Teiler,
    wie z. B. 6 = 1 + 2 + 3 oder 28 = 1 + 2 + 4 + 7 + 14.
    Die nächsten vollkommenen Zahlen lauten 496, 8128, 33550336,
    8589869056, 137438691328 und 2305843008139952128.
    Schreiben Sie einen Algorithmus, der alle vollkommenen Zahlen bis 100.000.000 ausgibt
    (also 6, 28, 496, 8128, 33550336).
     */

    public static void main(String[] args) {

        moduloZahlen();

    }


    public static void moduloZahlen (){

        //für welche Zahlen
        for (long i = 1; i < 100000;i++){
            long sum = 0;
            //für welches Modulo
            for (long j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
                if (sum > i) {
                    break;
                }
        }
            if (sum == i) {
                System.out.println(sum + " ist eine vollkommene Zahl");
            }
        }
    }
}
