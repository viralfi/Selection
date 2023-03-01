package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.util.Scanner;

public class Listing1_Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is " +
                (number1 / number2));
    }
}
