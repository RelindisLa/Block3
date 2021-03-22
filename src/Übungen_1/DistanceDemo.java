package Übungen_1;

public class DistanceDemo {
    public static void main(String[] args) {

        System.out.println("kmToMiles(25) = " + kmToMiles(25) + "meilen");
        System.out.println("milesToKM(25) = " + milesToKM(25) + "km");


    }

    public static double kmToMiles (int km) {
        double inMiles;
        inMiles = km / 1.609;
        return inMiles;
    }

    public static double milesToKM (int miles) {
        double inKM;
        inKM = miles * 1.609;
        return inKM;
    }

}
