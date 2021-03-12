import java.util.Arrays;

public class ExerciseNumbers {
    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };

                System.out.println("arr.length = " + arr.length);

        System.out.println("die kleinste Nummer ist: " + findSmalestNr(arr));

        System.out.println("die kleinste Nummer ist: " + findBiggestNr(arr));

        System.out.println("die Summe ist: " + findSumme(arr));

        System.out.println("die Durchschnittszahl ist: " + findAverage(arr));

        //System.out.println(Arrays.toString(findDubleArray(arr)));

        System.out.println("folgende Zahlen sind mehrfach: " + Arrays.toString(returnDublicates(arr)));


    }

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmalestNr (int[] arr) {
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < keep) {
                keep = arr[i];
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
    public static int findAverage (int[] arr) {

        int average = findSumme(arr) / arr.length;
        return average;

    }


    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
    /*public static int[] findDubleArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr [i] = arr [i]*2;
        }
        return arr;
    }

     */


    public static int[] returnDublicates (int[] arr) {
        boolean aufsteigend = true;

        while (aufsteigend == true) {
            aufsteigend = false;
            for (int i =0; i < arr.length; i++) {
                for (int i2 =i + 1; i2 < arr.length; i2++) {
                    if (i < i2);
                    }
                return arr;
                }
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    aufsteigend = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    }
                }
            }return arr;
        }

}


