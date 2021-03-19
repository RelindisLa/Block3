package Übungen_1;

public class RechteckDemo {
    public static void main(String[] args) {

        System.out.println("berechneFlache eines Rechteckes von (25, 10) cm = " + berechneFlache(25, 10) + "cm²");
        System.out.println("berechneUmfang eines Rechteckes von (25, 10) cm = " + berechneUmfang(25, 10) + "cm");



    }

    public static int berechneUmfang (int lange, int breite) {
        int umfang;
        umfang = 2 * (lange + breite);

        return umfang;
    }

    public static int berechneFlache (int lange, int breite) {
        int flache = lange * breite;

        return flache;
    }



}
