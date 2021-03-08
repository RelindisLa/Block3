import java.util.Arrays;

public class SortDemoApp {
    public static void main(String[] args) {

        int[] arr = new int[7];
        arr [0] = 9;
        arr [1] = 8;
        arr [2] = 7;
        arr [3] = 6;
        arr [4] = 5;
        arr [5] = 4;
        arr [6] = 3;
        arrangeOrder(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        /*int[] arr2 = {54, 45, 33, 12, 77, 21, 99};
        arrangeOrder(arr2);
        Arrays.toString(arr) ist das gleiche wie:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        } */


        //for ()

        for (int i = 0; i < arr.length -1; i++) {
            if (arr [i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));

        }


    public static void arrangeOrder(int[] numbers) {
        System.out.println("lenght = " + numbers.length);

        int temp = numbers[1];
        numbers[1] = numbers[0];
        numbers[0] = temp;
    }


}
