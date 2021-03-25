package Übungen;

public class ArrayDemo2D {

    public static void main(String[] args) {

        //TODO: 1Dimensionales Array:
        //Kurze Version declarate and
        String [] lieblingsessen = {"Schoko", "Karotten", "Gras", "Heu"};

        //Lange Version
        String [] allergieEssen = new String[5];
        allergieEssen [0] = "Kohl";
        allergieEssen [1] = "Liguster";

        //how to iterate over an array
        System.out.println("--- 1D Array: ---");
        for (int f = 0; f < lieblingsessen.length; f++) {
            System.out.println(lieblingsessen[f]);
        }




        //TODO: 2Dimensionales Array
        //Deklarieren und Werte vergeben in einem
        // lang: String [][] food = new String [2][4];
        String [][] foods = {{"Schoko", "Karotten", "Gras", "Heu"},{"Bananen", "Cranberrys", "Erdbeeren"}};

        foods [0][2] = "Pineapple";

        System.out.println("--- 2D Array: ---");
        for (int row = 0; row < foods.length; row++) {
            for (int col = 0; col < foods[row].length; col++ ) {
                System.out.println(foods[row][col]);
            }
            System.out.println("--");
        }



    }
}
