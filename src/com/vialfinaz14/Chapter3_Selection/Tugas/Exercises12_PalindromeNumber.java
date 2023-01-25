package com.vialfinaz14.Chapter3_Selection.Tugas;

import java.util.Scanner;

public class Exercises12_PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();
        int digit = (int) (number / 100);
        int remaining = number % 100;
        int digit3 = (int) (remaining % 10);
        System.out.println(number +
                (((digit == digit3)) ? "is a " : " is not a ") + "Palindrom");
    }
}
