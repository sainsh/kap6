package com.company.six;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the legth of the pattern: ");
        displayPattern(in.nextInt());


    }

    public static void displayPattern(int n) {

        String output = "";


        for (int i = 1; i < n + 1; i++) {   //giver n linjer

            for(int m = n ; m > i; m--){    //formaterer outputtet
                output += "\t";
            }

            for (int j = i; j > 0; j--) {//skriver tallene n n-1 n-2 ...

                output+= j + "\t";

            }
                output += "\n";

        }

        System.out.println(output);
    }
}
