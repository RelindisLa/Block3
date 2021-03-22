package Übungen_3;

import java.util.Arrays;

public class ExersiceNumbers3 {

    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};

        System.out.println("arr.length = " + arr.length);
        System.out.println("durchschnittsWert(arr) = " + durchschnittsWert(arr));




    }

    // TODO 6: Write a method, to calculate the average over all values (think about datatype)

    public static float durchschnittsWert (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            }
        float durchschnitt = sum / arr.length;
        return durchschnitt;
    }

    // TODO 7: Write a method, which replaces one number by a new new number
    //  => public static void replace(int searchNumber, int newNumber)




    // TODO 8 (complicated): Write a method which extends an array by one number. You need to create a new array with a length + 1 and copy existing values to array and add the new number at end



}