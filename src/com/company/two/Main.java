package com.company.two;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // input from user

        System.out.print("enter a multidigit number: "); //prompt user to enter number
        System.out.println("mult of digits is: " + sumDigites(in.nextInt())); // run muldigits method
    }

    public static int sumDigites(long digites){

        int sum = 0;       //start value of return value


        while(digites != 0) {      //stops when there are no digits left

            sum += digites % 10;       //ekstraks last digit
            digites /= 10;              //removes last digit


        }

        return sum;
    }

}



