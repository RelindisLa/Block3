package Klassen.Math.Übung_1;

public class Bunny {
    String name;
    String color;
    int age;
    double height;
    double weight;
    static String latinName = "species Name";




    public static void main(String[] args) {
        System.out.println("we will do something important");

        Bunny bugs = new Bunny();
        bugs.jump(24);
        bugs.name = "Bugs Bunny";
        System.out.println(bugs.name);
        //class bezieht sich auf das Objekt!, eines für eines
        System.out.println(Bunny.latinName);
        //Static bezieht sich auf die Vorlage!, eines für alle

        Bunny roger = new Bunny();



        System.out.println();
        jumpStatic(20.4);
        bugs.jump(24);
        roger.jump(18);




    }

    public static void jumpStatic (double jumpheight){
        System.out.println("jumps " + jumpheight);

    }

    public void jump (double jumpheight){
        //in instance methode i can access and use attributes
        System.out.println(name + " jumps " + jumpheight + "cm hoch.");
    }

}
