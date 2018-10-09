package com.company.elleven;

public class Main {

    public static void main(String[] args) {

        System.out.printf("%s\t%s\t%10s\n", "Sales Amount", "|", "Commission");
        System.out.print("_____________________________________\n");

        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%d\t\t\t%s\t%10.1f\n", i, "|", computeCommission(i));

        }

    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;

        commission += 5000.0 * 8 / 100;

        salesAmount -= 5000;

        if(salesAmount>0 && salesAmount >=10000){
            commission += 5000.0 * 10/100;
            salesAmount -=5000;
        } else if(salesAmount >0){
            commission += salesAmount * 10/100;
        }

        if(salesAmount > 0){
            commission += salesAmount*12/100;
        }


        return commission;
    }
}
