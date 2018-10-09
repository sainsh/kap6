package com.company.twelve;

public class Main {
    public static void main(String[] args) {

        printChars('1', 'Z', 10);

    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        String output = "";
        int count =0;

        for (int i = ((int) ch1); i <= ((int) ch2); i++) {

            output += ((char) i) + " ";

            count++;
            if (count % numberPerLine== 0) {
                output += "\n";
            }
        }

        System.out.println(output);
    }
}
