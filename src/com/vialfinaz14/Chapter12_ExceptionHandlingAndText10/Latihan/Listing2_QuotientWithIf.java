package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.util.Scanner;

public class Listing2_QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " is " +
                    (number1 / number2));
        else
            System.out.println("Divisor cannot be zero");
    }
}
