
package at.campus02.iwi.pr1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Pr1Bsp1Test {

    private int[] GENRES;
    private String[] ARTISTS;
    private double[] LENGTHS;

    @Before
    public void setup(){
        GENRES = at.campus02.iwi.pr1.RecordsData.GENRES;
        ARTISTS = at.campus02.iwi.pr1.RecordsData.ARTISTS;
        LENGTHS = at.campus02.iwi.pr1.RecordsData.LENGTHS;
    }

    @Test
    public void testIstSingle() {
        assertTrue(at.campus02.iwi.pr1.Records.istSingle(LENGTHS, 3));
        assertTrue(at.campus02.iwi.pr1.Records.istSingle(LENGTHS, 4));
    }

    @Test
    public void testPlattenVonInterpret() {
        int nirvana = at.campus02.iwi.pr1.Records.plattenVonInterpret(ARTISTS, "Nirvana");
        int kroko_jack = at.campus02.iwi.pr1.Records.plattenVonInterpret(ARTISTS, "Kroko Jack");
        assertEquals(nirvana, 8);
        assertEquals(kroko_jack, 0);
    }

    @Test
    public void testNimmInterpret() {
        int[] nirvana_alben = at.campus02.iwi.pr1.Records.nimmInterpret(ARTISTS, "Nirvana");
        int[] kroko_jack_alben = at.campus02.iwi.pr1.Records.nimmInterpret(ARTISTS, "Kroko Jack");

        int[] nirvana_soll = new int[]{37, 51, 63, 112, 115, 118, 133, 177};
        int[] kroko_jack_soll = new int[0];

        assertArrayEquals(nirvana_alben, nirvana_soll);
        assertArrayEquals(kroko_jack_alben, kroko_jack_soll);
    }

    @Test
    public void testMittlereDauerAlbum() {
        assertEquals(at.campus02.iwi.pr1.Records.mittlereDauerAlbum(LENGTHS), 59.85, 0.01);
    }

    @Test
    public void testGesamtspieldauer() {
        assertEquals(at.campus02.iwi.pr1.Records.gesamtspieldauer(LENGTHS), 9885.29, 0.01);
    }

    @Test
    public void testNextSingle() {
        assertEquals(at.campus02.iwi.pr1.Records.nextSingle(GENRES, LENGTHS, 0), 64);
        assertTrue(at.campus02.iwi.pr1.Records.istSingle(LENGTHS, 64));

        assertEquals(at.campus02.iwi.pr1.Records.nextSingle(GENRES, LENGTHS, 3), 4);
        assertTrue(at.campus02.iwi.pr1.Records.istSingle(LENGTHS, 4));

        assertEquals(at.campus02.iwi.pr1.Records.nextSingle(GENRES, LENGTHS, 4), 7);
        assertTrue(at.campus02.iwi.pr1.Records.istSingle(LENGTHS, 7));

        assertEquals(at.campus02.iwi.pr1.Records.nextSingle(GENRES, LENGTHS, 8), 9);
        assertTrue(at.campus02.iwi.pr1.Records.istSingle(LENGTHS, 9));

        // No more ..
        assertEquals(at.campus02.iwi.pr1.Records.nextSingle(GENRES, LENGTHS, 199), -1);
    }

    @Test
    public void testNextfive() {
        assertEquals(at.campus02.iwi.pr1.Records.nextFive(LENGTHS, GENRES, 0, 0), 18.218, 0.001);
        assertEquals(at.campus02.iwi.pr1.Records.nextFive(LENGTHS, GENRES, 1,0), 51.80, 0.01);
        assertEquals(at.campus02.iwi.pr1.Records.nextFive(LENGTHS, GENRES,2,163), 20.23, 0.01);
    }
}

