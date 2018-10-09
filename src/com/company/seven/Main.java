package com.company.seven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter investment amount and monthly interest rate: ");

        System.out.printf("The final amount after 30 years: %f ", futureInvestmentValue(in.nextDouble(),in.nextDouble()/12,30));

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double investmentReturn=0;
        System.out.printf("%s%20s\n","Years","Future Value");

        for(int i = 1; i < years +1; i++){
            investmentReturn = investmentAmount*Math.pow(1.0+monthlyInterestRate/100,12.0);
            investmentAmount = investmentReturn;

            System.out.printf("%d\t%20f\n", i, investmentReturn);
        }

        return investmentReturn;
    }
}
