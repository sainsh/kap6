package com.company.nine;

public class Main {

    public static void main(String[] args) {
        int j = 20;

        System.out.printf("%s %15s\t\t%2s %15s %15s \n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("_______________________________________________________________");

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%s\t%15.3f %10s %15s %15.3f \n", i, footToMeter(i), "|", j, meterToFoot(j));

            j += 5;
        }
    }

    public static double footToMeter(double foot){
        return 0.305*foot;
    }
    public static double meterToFoot(double meter){
        return 3.279*meter;
    }
}
