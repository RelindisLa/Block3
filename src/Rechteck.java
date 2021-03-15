public class Rechteck {

    double länge;
    double breite;
    String name;

    public double calcFläche () {
        return länge * breite;
    }

    public double calcDiagonale () {
        double Diagonale = Math.sqrt(Math.pow(länge,2) + Math.pow(breite,2));
        return Diagonale;
    }

    public void print (){
        System.out.println("Das Rechteck " + name + " hat die Größe "
                + länge + "cm x " + breite + "cm, der Flächeninhalt ist: " + calcFläche() + ", die Diagonale beträgt: "+ calcDiagonale() + "cm.");

    }
}
