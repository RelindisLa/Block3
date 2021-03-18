public class WiederholungVollkommeneZahl {

    public static void main(String[] args) {
        //PerfectNumbers: die Summe der Teiler = Zahl
        //Bsp.: 6 = 1 + 2 + 3 || 28 = 1 + 2 + 4 + 7 + 14
        //klein Anfangen - zuerst Methode für 6, 5

        System.out.println(calcDivisors(5));
        System.out.println(isPerfectNumber(5));
        System.out.println(calcDivisors(6));
        System.out.println(isPerfectNumber(6));

        for (int i = 1; i < 100_000_000; i++) {
            if (isPerfectNumber(i) == true) {
                System.out.println(i + " is perfekt number");
            }
        }

    }

    //Methode um zu Prüfen ob 6 eine Perfekte Nummer ist
    /* was ist das return value?, if yes - think about the Datatype,
       if NO - Datadype is VOID
       what does the Method need from the caller to fulfill the job

     */

    public static boolean isPerfectNumber (int number){
        if (number == calcDivisors(number)) {
            return true;
        }
        return false;

    }

    public static int calcDivisors (int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
