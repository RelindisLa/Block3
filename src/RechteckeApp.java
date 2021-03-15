public class RechteckeApp {

    public static void main(String[] args) {

        Rechteck A = new Rechteck();
        Rechteck B = new Rechteck();

        A.länge = 3;
        A.breite = 4;

        B.länge = 80;
        B.breite = 100;

        A.print();
        B.print();
    }
}
