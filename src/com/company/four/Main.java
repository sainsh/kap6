package com.company.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to see it\'s reverse: ");
        int number = in.nextInt();
        System.out.printf("The reverse of %s is %s",number, reverse(number));
    }

    public static int reverse(int number){
        String reverseString = "";
        while (number != 0) {
            reverseString += Integer.toString(number % 10);
            number = number / 10;
        }

        return Integer.parseInt(reverseString);
    }
}
