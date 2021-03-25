package at.campus02.iwi.pr1;

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
        System.out.println(nimmInterpret(ARTISTS, "Nirvana"));
        System.out.println(nimmInterpret(ARTISTS, "Kroko Jack"));
        nimmInterpret(ARTISTS,"Blub");



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
        int[] allePlatten = new int[plattenVonInterpret(artists, artist)];
        int index = 0;
            for (int i = 0; i < artists.length; i++) {
                if (artists[i].equals(artist)){
                    //artist.equals(artists[i])
                    //  ist artist an Stelle Artist/Pos.i gleich artist, wenn ja, dann
                    allePlatten[index] = i;
                    index++;
                }
                System.out.println(index);
            }
        return allePlatten[];
    }


    public static double mittlereDauerAlbum(double[] lengths) {
        return 0.0;
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
