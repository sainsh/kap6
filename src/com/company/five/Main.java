package com.company.five;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 decimal numbers: ");
        displaySortedNumbers(in.nextDouble(), in.nextDouble(), in.nextDouble());

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double[] order = {num1, num2, num3};
        double temp;

        for (int i = 0; i < order.length; i++) {        // løber arrayet igennem 1 gang for hvert tal
            for (int j = 0; j < order.length; j++) {
                if (order[j] < order[i]) {              //tjekker om der er nogen større tal i arrayet
                    temp = order[j];                    //hvis ja så bytter de plads i arrayet
                    order[j] = order[i];
                    order[i] = temp;

                }
            }
        }


        System.out.printf("in ascending order: %f\t%f\t%f", order[0], order[1], order[2]);
    }
}
