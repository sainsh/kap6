package com.company.eigth;

public class Main {
    public static void main(String[] args) {
        int j = 120;

        System.out.printf("%s %15s %5s %15s %15s \n", "celsius", "fahrenheit", "|", "fahrenheit", "celsius");
        System.out.println("_______________________________________________________________");

        for (int i = 40; i >= 31; i--) {

            System.out.printf("%s %15.2f %10s %15s %15.2f \n", i, celsiusToFahrenheit(i), "|", j, fahrenheitToCelcius(j));

            j -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;

        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit){
        double celcius = (5.0/9)*(fahrenheit-32);
        return celcius;
    }
}
