package Übungen.Übungen_8;

public class PowerDemo {

    public static void main(String[] args) {
        int x = 0;
        int n = 0;


        System.out.println(powerTimesN(3,0));
        System.out.println(powerTimesN(3,1));
        System.out.println(powerTimesN(3,3));
        System.out.println(powerTimesN(2,3));
        System.out.println(powerTimesN(2,4));
        System.out.println();
        System.out.println(powerSimple(3,0));
        System.out.println(powerSimple(3,1));
        System.out.println(powerSimple(3,3));
        System.out.println(powerSimple(2,3));
        System.out.println(powerSimple(2,4));


    }

    public static int powerTimesN (int x, int n) {
        int value = 1;
        for (int i = 0; i < n; i++){
            value = value * x;
        }
        return value;
    }

    public static int powerSimple (int x, int n){

        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        if (n % 2 == 0)
            return powerSimple(x, n / 2) * powerSimple(x, n / 2);
        else
            return x * powerSimple(x, n / 2) * powerSimple(x, n / 2);
    }





}
