import java.util.Arrays;

public class ExerciseNumbers2 {

    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};

        System.out.println("arr.length = " + arr.length);

        System.out.println("folgende Nummern sind doppelt: " + (Arrays.toString(findDoubleNumbers(arr))));
        


    }


    public static int[] findDoubleNumbers(int[] arr) {
        Arrays.sort(arr);
        int[] doppelteZahl = new int[arr.length];
        int counter = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            int keep = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == keep) {
                    arr[j] = doppelteZahl[counter];
                    counter++;
                }
            }
        }
        return doppelteZahl;
    }
}

