package Übungen_1;

public class TemperaturDemo {

    public static void main(String[] args) {

        System.out.println("celsiusToFahrenheit(0°C) = " + celsiusToFahrenheit(0) + "°F");
        System.out.println("celsiusToFahrenheit(10°C) = " + celsiusToFahrenheit(10) + "°F");
        System.out.println("celsiusToFahrenheit(100°C) = " + celsiusToFahrenheit(100) + "°F");
        System.out.println();
        System.out.println("fahrenheitToCelsius(0°F) = " + fahrenheitToCelsius(0) + "°C");
        System.out.println("fahrenheitToCelsius(10°F) = " + fahrenheitToCelsius(10) + "°C");
        System.out.println("fahrenheitToCelsius(100°F) = " + fahrenheitToCelsius(100) + "°C");


    }

    public static long celsiusToFahrenheit (int celsius) {
        long inFahrenheit;
        inFahrenheit = celsius * (9/5) + 32;
        return inFahrenheit;
    }

    public static long fahrenheitToCelsius (int fahrenheit) {
        long inCelsius;
        inCelsius = (fahrenheit - 32) * 5/9;
        return inCelsius;
    }
}
