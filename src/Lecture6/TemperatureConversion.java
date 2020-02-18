package Lecture6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsiusDegrees = scanner.nextDouble();

        System.out.printf("%.2f °C = %.2f °F %n", celsiusDegrees, convertToFahrenheit(celsiusDegrees));
        System.out.printf("%.2f °C = %.2f K", celsiusDegrees, convertToKelvin(celsiusDegrees));
    }

    public static double convertToFahrenheit(double celsiusDegrees) {
        return (celsiusDegrees * 9 / 5) + 32;
    }

    public static double convertToKelvin(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }
}