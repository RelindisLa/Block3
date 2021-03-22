package Übungen_1;

public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand = 1000;
        double zinsen = 2.5;

        System.out.println("bei Zinsen von " + zinsen + "%, erhält man beim Kontostand von € " + kontostand + " folgende Zinsen: " + erhalteneZinsen(kontostand, zinsen));
        System.out.println("der neue Kontostand beträgt: € " + neuerKontostand(kontostand, zinsen));


    }

    public static double erhalteneZinsen(double kontostand, double zinsen) {
        double neueZinsen;
        neueZinsen = kontostand/100 * zinsen;
        return neueZinsen;
    }
    
    public static double neuerKontostand (double kontostand, double zinsen){
        double neuKonto;
        neuKonto = kontostand + (kontostand/100 * zinsen);
        return neuKonto;
    }


}
