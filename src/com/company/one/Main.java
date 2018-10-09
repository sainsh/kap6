package com.company.one;

public class Main {

    public static void main(String[] args) {

        //pentagonal numbers


        for (int i = 1; i < 101; i++) { //løber tal igennem fra 1 til 100

            System.out.printf("%5s \t", getPentagonalNumber(i)); //printer pentagonal number ud
            if (i % 10 == 0) {
                System.out.print("\n");             //ny linje hvis i går op i 10
            }
        }

    }

    public static int getPentagonalNumber(int n) {

        n = n * (3 * n - 1) / 2;        //formel for pentagonal number

        return n;
    }

}

