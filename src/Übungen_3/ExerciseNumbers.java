package Übungen_3;

import java.util.Arrays;

public class ExerciseNumbers {

    public static void main(String[] args) {
        int[] arr1 = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};

        System.out.println("arr.length = " + arr1.length);

        System.out.println("die kleinste Nummer ist: " + findSmalestNr(arr1));

        System.out.println("die kleinste Nummer ist: " + findBiggestNr(arr1));

        System.out.println("die Summe ist: " + findSumme(arr1));

        System.out.println();
        int[] arr2 = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};
        System.out.println("arr = " + Arrays.toString(arr2));

        System.out.println("folgende Nummern sind doppelt: " + Arrays.toString(duplicates(arr2)));

        System.out.println("numberOfDuplicates(arr) = " + numberOfDuplicates(arr2));


    }

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmalestNr(int[] arr) {
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < keep) {
                arr[i] = keep;
            }
        }
        return keep;
    }

    // TODO 2: Write a method, finding and returning the biggest number
    public static int findBiggestNr(int[] arr) {
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > keep) {
                keep = arr[i];
            }
        }
        return keep;
    }

    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    public static int findSumme(int[] arr) {
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + arr[i];
        }
        return summe;
    }


    // TODO 4: Write a method, calculating and returning the average over all numbers
    public static int findAverage(int[] arr) {

        int average = findSumme(arr) / arr.length;
        return average;
    }



    // TODO 5a: Write a method, which returns the array with the doble numbers
    public static int[] duplicatedArrayMultiplication ( int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
    //First, find number oft dupiclates. Then create array with the right size and fill it with these duplicates
    public static int[] duplicates (int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length - 1; j++){
                if (i !=j){
                    if (numbers[i] == numbers[j]){
                        counter++;
                    }
                }
            }
        }
        int[] duplicates = new int[numberOfDuplicates(numbers)];
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1+i; j < numbers.length - 1; j++){
                if (i != j){
                    if (numbers[i] == numbers[j]){
                        duplicates[counter] = numbers[i];
                        counter++;
                    }
                }
            }
        }
        return  duplicates;
    }

    //Method to find number of duplicates in array
    public static int numberOfDuplicates (int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length - 1; j++){
                if (i != j ){
                    if (numbers[i] == numbers[j]){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}