package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listing5_InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is reguired)");
                input.nextLine();
            }
        }while (continueInput);
    }
}
