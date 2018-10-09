package com.company.three;

import java.util.Scanner;

public class Main {

    //////////////////////////////////////
    //              6.3                 //
    //////////////////////////////////////

    public static void main(String[] args) {

        System.out.print("enter a number to test if it\'s a palindrome: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(isPalindrome(number)){
            System.out.printf("%s is a palindrome",number);
        }else{
            System.out.printf("%s is not a palindrome", number);
        }


    }

    public static int reverseWithString(int number){

        //this method reverses the number using a String as intermediate value, then converting it to an int
        //but you could use Integer.reverse(number) to get the same value as below

        String reverseString = "";
        while(number != 0) {
            reverseString += Integer.toString(number % 10);
            number = number /10;
        }


        return Integer.parseInt(reverseString);
    }

    public static boolean isPalindrome(int number) { //returns true if the reverse of the number is the same as the number
        if (reverseWithString(number) == number) {
            return true;
        } else {

            return false;
        }
    }
}
