public class Schaltjahr {

    public static void main(String[] args) {
        int year = 0;

        isLeapYear(1992);
        isLeapYear(2000);
        isLeapYear(1991);

        System.out.println(allLeapYear(0));

        /*int count = 0;
        for (int i = 0; i<= 2100; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }

         */





    }


    /*public static boolean istSchaltjahr (int year, boolean showPrintMessage) {
        if (year% 100 == 0) {
            if ( year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            }
        }
        return year;
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
                System.out.println( i + "-> kein Schaltjahr");
            }

            if ( i % 400 == 0) {
                System.out.println(i + " ist ein Schaltjahr");
            }
        }
        return counter;

    }
}
