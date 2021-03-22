package Übungen_3;

import java.util.Arrays;

public class ExerciseNumbers2 {

    public static void main(String[] args) {

        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};

        System.out.println("Folgende Zahlen sind in der Reihe: ");
        printArray(arr);

        System.out.println();
        System.out.println("arr.length = " + arr.length);
        System.out.println("Die doppelten Zahlen sind: " + Arrays.toString(findDoubleNumbers(arr)));

        


    }

    public static void printArray (int[] numbers) {
        for (int i = 0; i < numbers.length; i++ ) {
            System.out.print(numbers[i] + ", ");
        }
    }


    public static int[] findDoubleNumbers(int[] numbers) {
        Arrays.sort(numbers);
        int counter = 0;


        for (int i = 0; i < numbers.length - 1; i++) {
            int keep = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == keep) {
                    System.out.println(numbers[j]);
                    keep = numbers[i];
                }
            }
        }
        return numbers;
    }
}

