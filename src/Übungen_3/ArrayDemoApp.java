package Übungen_3;

import java.util.Arrays;

public class ArrayDemoApp {
    public static void main(String[] args) {

        /*
        datatype [] name = new datatype [length];
        name[positionname 0...length] = values of datatype

         */



        int [] intArray = new int [5];  // statt zu benennen a, b, c, d, e, || int z1, z2, z3, z4, z5;
        intArray[0] = 1;
        intArray[1] = 45;
        intArray[2] = 36;
        intArray[3] = 9;
        intArray[4] = 99; // für den 5. Wert

        for (int i = 0; i < 5; i++) {
            System.out.println(intArray[i] + ", ");
            System.out.print(Arrays.toString(sortiereZahlen(intArray)));

        }
    }
    public static int [] sortiereZahlen (int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
