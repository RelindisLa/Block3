package Übungen_7;

public class Fibonacci {

    public static void main(String[] args) {
        /*
        Fibonacci ist eine Folge natürlicher Zahlen, welche wie folgt abläuft:
        0, 1, 1, 2, 3, 5, 8, 13, ....
        Sie wird jeweils aus der Summe der beiden vorhergehenden Zahlen berechnet:
         */
        //System.out.println(sumFibonacci(0));
        System.out.println(fibonacci(14));

        for (int i = 0; i < 41; i++){
            System.out.println(" Fibonacci Nr. " + i + ": " + fibonacci(i));

        }



    }

    public static int fibonacci (int a) {
        //starting point: 0 + 1
        if (a == 0) {
            return 0;
        }
        else if (a <= 2) {
            return 1;
        }
        //ab 1:
        else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }


    /*
    public static int sumFibonacci (int number) {
        //starting point: 0 + 1
        if (number < 1){
            number = number + 1;
                //ab 1+1
            if (number < 1000) {
                System.out.print(number + ", ");
                return number + sumFibonacci(number);
                }
            else
                return 0;
        }
        return 0;
    }
     */


}
