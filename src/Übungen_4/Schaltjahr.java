package Übungen_4;

public class Schaltjahr {

    public static void main(String[] args) {


        /*Lehrvortrag:

        int year = 0;
        int count = 0;
        for (int i = 0; i <= 2100; i++) {
            if (isLeapYear(i, true))
            {
                count++;
            }
        }
        System.out.println("count = " + count);

         */


        isLeapYear(1992);
        isLeapYear(2000);
        isLeapYear(1991);

        System.out.println(allLeapYear(0) + " so viele Jahre");


    }

    /* Lehrvortrag:
    public static boolean isLeapYear(int year, boolean showPrintMessages){

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                if (showPrintMessages)
                    System.out.println(year + " is a leap year");

                return true;
            }
        }
        else {
            if (year % 4 == 0){
                if (showPrintMessages)
                    System.out.println(year + " is a leap year");

                return true;
            }
        }
        return false;
    }

    */



    public static void isLeapYear (int year) {

        if (year% 100 == 0) {
            if ( year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            }
        }
        else
            if (year % 4 == 0) {
            System.out.println(year + " is a Leap year");
        }
            else {
                System.out.println(year + " is not Leap year");
            }
    }

    public static int allLeapYear (int year) {
        int counter = 0;
        for (int i = 1;i <= 2100;i++){
            if (i % 4 == 0) {
                System.out.print(i + ", ");
                counter++;
            }

            if (i % 100 == 0){
                System.out.println( i + "-> kein Übungen_4.Schaltjahr");
            }

            if ( i % 400 == 0) {
                System.out.println(i + " ist ein Übungen_4.Schaltjahr");
            }
        }
        return counter;
    }

}
