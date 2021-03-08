public class Zinsrechner {

    public static void main(String[] args) {

/* startCapital; 1000.00
        rates: 1.5 %
        years: 10

        output:
        End year 1: 1000.00 -> 1015.00
 */


        double result = calcInterest(1000, 1.5, 10);
        System.out.println("result = " + result);

    }
    public static double calcInterest(double startCapital,double rates, int year) {
        for (int i = 1; i <= year; i++) {
            double calc = startCapital * (1 + rates / 100.0);
            System.out.println("End of " + i + " year: " + startCapital + " -> " + calc );
            startCapital = calc;
        }
        return startCapital;
    }
}
