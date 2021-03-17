public class NarzistischeZahlen {

    /*
    Aurelius Agustinus Augustine (354 –430 n. Chr.) entdeckte mit der 153 die erste narzisstische Zahl,
    die sich aus der Summe der dritten Potenzen der Ziffern ergibt. 153 = 13+ 53+ 33
    Schreiben Sie einen Algorithmus, der alle narzisstischen Zahlen zwischen 1 und 1.000 ausgibt.
     */

    public static void main(String[] args) {

        narzistischeZahlen();

    }

    public static void narzistischeZahlen() {

        for (int zahl = 1; zahl < 1000 ; zahl++) {
            int z1 = zahl / 100;
            int z2 = (zahl / 10) % 10;
            int z3 = zahl % 10;
            double sum = 0;
            sum = Math.pow(z1,3) + Math.pow(z2,3) + Math.pow(z3,3);

            if (sum == zahl) {
                System.out.println(sum);
            }
        }
    }
}
