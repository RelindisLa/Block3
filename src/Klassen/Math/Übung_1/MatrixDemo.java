package Klassen.Math.Übung_1;

public class MatrixDemo {
    public static void main(String[] args) {

        double [][] id = generateIdentityMatrix(5);
        printMatrix(id);



    }



    public static void printMatrix(double[][] matrix) {
        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int spalte = 0; spalte < matrix[zeile].length; spalte++) {
                System.out.print(matrix[zeile][spalte] + "\t");
            }
            System.out.println();
        }
    }


    public static double[][] generateIdentityMatrix(int size){
        double [][] matrix = new double[size][size];
        for (int spalte = 0; spalte < size; spalte++) {
            for (int zeile = 0; zeile < size; zeile++) {
                if(zeile == spalte) {
                    matrix [zeile][spalte]= 1;
                }
                else {
                    matrix[zeile][spalte] = 0;
                }
            }
        }
        return matrix;
    }

}
