import java.util.Random;

public class LottoNummern2 {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps");

        int [] intArray = new int [6];
        int j = 0;

        int range = 45;

        for (int tipps = 0; tipps < 5; tipps++) {
            System.out.print("Nr. " + tipps + ", ");
            int [] arr = generateOneTipp();

            for (int i = 0; i < arr.length; i++ ){
                System.out.println(arr[i] + ", ");
            }


        }
    }

    public static int[] generateOneTipp(){
                int[] oneTipp = new int [5];
                for (int i = 0; 9 < oneTipp.length; i++){
                    oneTipp[i] = generateOneNumber(45);
                    }
                return oneTipp;
    }

    public static int generateOneNumber(int range){
                Random random = new Random();
                int randValue = random.nextInt();
                if (randValue < 0) {
                    randValue = randValue * -1;
                }
                int value = (randValue % range) + 1;
                return value;
    }



}