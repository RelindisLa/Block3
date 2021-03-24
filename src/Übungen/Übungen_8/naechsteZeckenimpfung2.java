package Übungen.Übungen_8;

public class naechsteZeckenimpfung2 {

    int [] alter = new int[]{10,30,50,60,80};
    long[] letztesImpungsjahr = new long[]{2017,2014,2019,2018,2020};
    String[] ersteAuffrischung = new String[]{"j","n","n","j","n"};

    public static void main(String[] args) {

        int year = 2021; //aktuelles Jahr
        System.out.println("Heuer ist das Jahr: " + year);

        System.out.println("für 10 jährigen ist folgendes nötig: erste Auffrischung: " + ersteAuffrischung("j") + " und impfen im Jahr " + impfungInWelchemJahr(10,2017,year));
        System.out.println("für 30 jährigen ist folgendes nötig: erste Auffrischung: " + ersteAuffrischung("n") + " und impfen im Jahr " + impfungInWelchemJahr(30,2014,year));
        System.out.println("für 50 jährigen ist folgendes nötig: erste Auffrischung: " + ersteAuffrischung("j") + " und impfen im Jahr " + impfungInWelchemJahr(50,2019,year));
        System.out.println("für 60 jährigen ist folgendes nötig: erste Auffrischung: " + ersteAuffrischung("j") + " und impfen im Jahr " + impfungInWelchemJahr(60,2018,year));
        System.out.println("für 80 jährigen ist folgendes nötig: erste Auffrischung: " + ersteAuffrischung("n") + " und impfen im Jahr " + impfungInWelchemJahr(80,2020,year));



    }

    public static boolean ersteAuffrischung (String ersteAuffrischung){
        if (ersteAuffrischung.equals("j")){
            int ersteAuffrischtung = 1;
            return true;
        }
        else
            return false;
    }


    public static int impfungInWelchemJahr (int alter, int letzteImpfung, int aktuellesJahr){
        int imJahr = 0;

        if ((aktuellesJahr-letzteImpfung) > 5)
            return imJahr = aktuellesJahr;
        else if ((aktuellesJahr-letzteImpfung) < 5) {
            if (alter >= 60 || ersteAuffrischung("j") == true){
                return imJahr = letzteImpfung +3;
            }
            return imJahr = letzteImpfung + 5;
        }
        return imJahr;
    }

}
