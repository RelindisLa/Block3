import java.util.Arrays;

public class ExerciseNumbers<arr> {
    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };

                System.out.println("arr.length = " + arr.length);

        System.out.println("die kleinste Nummer ist: " + findSmalestNr(arr));

        System.out.println("die kleinste Nummer ist: " + findBiggestNr(arr));

        System.out.println("die Summe ist: " + findSumme(arr));

        //System.out.println("die Durchschnittszahl ist: " + findAverage(arr));

        //System.out.println(Arrays.toString(findDubleArray(arr)));

        //System.out.println("folgende Zahlen sind mehrfach: " + (Arrays.toString(returnDublicates(2, 3, 20))));

        //System.out.println(Arrays.toString(dublicates(arr)));
        System.out.println("folgende Nummern sind doppelt: " + (Arrays.toString(findDoubleNumbers(arr))));



    }

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmalestNr (int[] arr) {
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < keep) {
                arr[i] = keep;
            }
        }
        return keep;
    }
    // TODO 2: Write a method, finding and returning the biggest number
    public static int findBiggestNr (int[] arr) {
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > keep) {
                keep = arr[i];
            }
        }
        return keep;
    }

    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    public static int findSumme (int[] arr) {
        int summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + arr[i];
        }
        return summe;
    }


    // TODO 4: Write a method, calculating and returning the average over all numbers
    /*public static int findAverage (int[] arr) {

        int average = findSumme(arr) / arr.length;
        return average;
    }

     */


    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
    // TODO: version 1:
    /*public static int[] findDubleArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr [i] = arr [i]*2;
        }
        return arr;
    }

     */

// TODO: version 2:
     /* public static int[] dublicateArrayMulitplication (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2;
            }
        return numbers;
    }
     */

// TODO: version 3:
    /*
    public static int[] dublicates (int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0+i; j < numbers.length -1; j++) {
                if (i != j) {
                    if (numbers[i] == numbers[j]) {
                        counter++;
                    }
                }
            }
        }
        int [] dublicates = new int [numberOfDublicates(numbers)];
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length -1; j++) {
                if (i != j) {
                    if (numbers[i] == numbers[j]){
                        dublicates[counter] = numbers[i];
                        counter++;
                    }
                }
            }
        }
        return dublicates;
    }

    public static int numberOfDublicates (int[] numbers) {
        int counter = 0;
        for (int i = 0; i< numbers.length; i++) {
            for (int j = 0+i; j < numbers.length-1; j++) {
                if (i != j) {
                    if (numbers[i] == numbers[j]) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

     */
    // TODO: version 4:



    public static int [] findDoubleNumbers (int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        return arr;
    }

}


