package Übungen_4;

public class WiederholungNarzistischeZahlen {

    public static void main(String[] args) {
        //calc Digit Sum -> Block 2 bereits gemacht
        //153 = 1, 5, 3
        /*  153 % 10 = 3
            153 / 10 = 15
            15 % 10 = 5
            15 / 10 = 1
            1 % 10 = 1

            NarcisticNumber is 1^3 + 5^3 + 3^3 Summe der Digit^Anzahl der Digits
         */

        System.out.println(isNarcNr(153, 3));

        for (int exp = 3; exp <= 8; exp++) {
            System.out.println();
            System.out.print(exp + ": ");
            for (int i = 1; i < 30_000_000; i++) {
                if (isNarcNr(i, exp)) {
                    System.out.print(i + ", ");
                }
            }
        }


    }

    public static boolean isNarcNr (int number, int exp) {
        int sum = 0;
        int originalValue = number;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + ((int)Math.pow(digit, exp));
            }
        if ((sum == originalValue)){
            return true;
        }
        return false;
    }
}
