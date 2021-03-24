package Übungen.Übungen_8;

public class naechsteZeckenimpfung1 {

    int [] alter = new int[]{10,30,50,60,80};
    long[] letztesImpungsjahr = new long[]{2017,2014,2019,2018,2020};
    String[] ersteAuffrischung = new String[]{"j","n","n","n","n"};

    public static void main(String[] args) {

        int aktuellesJahr = 2021;
        System.out.println("Heuer ist das Jahr: " + aktuellesJahr);

        System.out.println("für 10 jährigen ist folgendes nötig: " + istImpfungFallig(10,2017,"j",2021));
        System.out.println("für 30 jährigen ist folgendes nötig: " + istImpfungFallig(30,2014,"n",2021));
        System.out.println("für 50 jährigen ist folgendes nötig: " + istImpfungFallig(50,2019,"j",2021));
        System.out.println("für 60 jährigen ist folgendes nötig: " + istImpfungFallig(60,2018,"j",2021));
        System.out.println("für 80 jährigen ist folgendes nötig: " + istImpfungFallig(80,2020,"j",2021));



    }

    public static boolean istImpfungFallig (int alter, long letztesImpfungsjahr, String ersteAuffrischung, int aktuellesJahr){
        long impfzeitraum = aktuellesJahr - letztesImpfungsjahr;
        long empfohlenesJahrderImpfung = 0;

        if (impfzeitraum>5){
            System.out.println("Der Impfintervall muss jetzt neu begonnen werden");
            return false;
        }
        if (alter >= 60){
            System.out.println("ab 60 Auffrischung alle 3 Jahre");
            if (impfzeitraum > 3){
                System.out.println("bitte gleich impfen");
            }
            else {
                empfohlenesJahrderImpfung = letztesImpfungsjahr + 3;
                System.out.println(empfohlenesJahrderImpfung);
                return true;
            }
        }
        else if (ersteAuffrischung.equals("j") && impfzeitraum > 3) {
            System.out.println("bitte gleich impfen");
            }
        else{
            empfohlenesJahrderImpfung = letztesImpfungsjahr + 5;
            System.out.println(empfohlenesJahrderImpfung);
        }
        return true;
    }
}
