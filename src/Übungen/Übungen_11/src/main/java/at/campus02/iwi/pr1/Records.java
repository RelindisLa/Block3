package at.campus02.iwi.pr1;

import java.util.Arrays;

public class Records {
    static final double LIMIT_SINGLE = 20.0;

    public static void main(String[] args) {
        final int[]    GENRES  = at.campus02.iwi.pr1.RecordsData.GENRES;
        final String[] ARTISTS = at.campus02.iwi.pr1.RecordsData.ARTISTS;
        final double[] LENGTHS = at.campus02.iwi.pr1.RecordsData.LENGTHS;


        System.out.println("ist es eine Singel? " + istSingle(LENGTHS,1));
        System.out.println(GENRES.length);
        System.out.println(ARTISTS.length);
        System.out.println(LENGTHS.length);
        System.out.println();
        System.out.println(plattenVonInterpret(ARTISTS, "Nirvana"));
        System.out.println(plattenVonInterpret(ARTISTS, "Kroko Jack"));
        System.out.println();

        /*Probieren:
        try{System.out.println(nimmInterpret(ARTISTS, "Kroko Jack")[0]);}
        catch (Exception e) {System.out.println("korrekter Fehler  da leer " + e);}
        System.out.println();
        //Implicit call to 'toString()' on array returned by call to 'nimmInterpret(ARTISTS, "Kroko Jack")'
        System.out.println(nimmInterpret(ARTISTS, "Kroko Jack"));
        */

        System.out.println();
        System.out.println(Arrays.toString(nimmInterpret(ARTISTS, "Nirvana")));
        System.out.println(Arrays.toString(nimmInterpret(ARTISTS, "Kroko Jack")));




        // in minuten
    }

    public static boolean istSingle(double[] lengths, int index) {
        if (lengths[index] > 20.0)
            return false;
        else
            return true;
    }

    public static int plattenVonInterpret(String[] artists, String artist) {
        int counter = 0;
        for (int i = 0; i < artists.length; i++) {
            if (artist.equals(artists[i])){
                counter++;
            }
        }
        return counter;
    }

    public static int[] nimmInterpret(String[] artists, String artist) {
        //artist = "Nirvana"
        int[] allePlatten = new int[plattenVonInterpret(artists, artist)];
        // int[] allePlatten = ist ein leeres int Array mit reservierung für 8 int variablen
        int index = 0;
            for (int i = 0; i < artists.length; i++) {
                //Diese Schleife lauft alle Lieder durch von 1bis200 -> int i Bereich 0-199
                if (artists[i].equals(artist)){

                    //artist.equals(artists[i])
                    //  ist artist an Stelle Artist/Pos.i gleich artist, wenn ja, dann
                    allePlatten[index] = i;
                    //Also der allePlatten[0-7]  wird jeweils ein int i Bereich 0-199 zugewiesen.
                    index++;
                // allePlatten[37, 51, 63, 112, 115, 118, 133, 177]
                }

            }
        return allePlatten; // Rückgabewert ist ein int-Array mit den Indizes der Platten des gewählten Interprete
    }


    public static double mittlereDauerAlbum(double[] lengths) {
        double summeSongs = 0;
        int counter = 0;

        for (int alleSongs = 0; alleSongs < lengths.length; alleSongs++) {
            if (istSingle(lengths,alleSongs) != true){
                summeSongs += lengths[alleSongs];
                counter++;
            }
        }

        return summeSongs / counter; // double Variable
    }

    public static double gesamtspieldauer(double[] lengths) {
        return 0.0;
    }

    public static int nextSingle(int[] genres, double[] lengths, int current) {
        return 0;
    }

    public static double nextFive(double[] lengths, int[] genres, int genre, int current) {
        return 0.0;
    }
}
