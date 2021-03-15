import java.util.Arrays;

public class Übungsblatt4Arrays {

    public static void main(String[] args) {


        int[] arr = {1, 45, 56, 23, 3, 89, 42, 22, 9, 18};

        System.out.println("Folgende Zahlen sind in der Reihe: ");
        printArray(arr);
        //System.out.println("Folgende Zahlen sind in der Reihe: " + Arrays.toString(printArray(arr)));

        System.out.println();
        System.out.println("Enthält die Nummer 23: " + containsNumber(arr, 23));
        System.out.println("Enthält die Nummer 42: " + containsNumber(arr, 42));
        System.out.println("Enthält die Nummer 2: " + containsNumber(arr, 2));

        System.out.println("Summe der Reihe ist: " + calculateSum(arr));

        int[] reversedArr = reverseArray(arr);
        System.out.println("die umgedrehte Reihe lautet: ");
        printArray(reversedArr);
        System.out.println();

        int[] reversedArr2 = reverseArray2(arr);
        System.out.println("die umgedrehte Reihe lautet: ");
        printArray(reversedArr2);
        System.out.println();

        int[] arr1 = orderdArray(arr);
        System.out.println("die sortierte Reihe lautet: " + Arrays.toString(orderdArray(arr1)));


    }




    public static void printArray (int[] numbers) {
        for (int i = 0; i < 10; i++ ) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public static boolean containsNumber (int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }


    public static int calculateSum (int[] numbers) {
        int sum = 0;
        for ( int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


    public static int[] reverseArray (int[] numbers) {
        int[] result = new int [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int newIndex = numbers.length - 1 -i;
            result[newIndex] = numbers[i];
        }
        return result;
    }

    public static int[] orderdArray (int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    public static int[] reverseArray2 (int[] numbers) {
        int [] reversedResult = new int[numbers.length];
        int newIndex = numbers.length -1;

        for (int i = 0; i < numbers.length; i++) {
            reversedResult[newIndex] = numbers[i];
            newIndex--;
            }
        return reversedResult;
    }
}
