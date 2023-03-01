package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.util.Scanner;

public class Listing3_QuotientWithMethod {
    public static int quotient(int numbers1, int numbers2) {
        if (numbers2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return numbers1 / numbers2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " +
                result);
    }
}
