package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises30FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.println("Enter the annual interes rate (e.g., 5): ");
        double AIR = input.nextDouble();
        System.out.println("Enter the number of months (e.g., 6): ");
        int month = input.nextInt();

        double mir = AIR / 1200;
        double cv = 0;
        for (int m = 1; m <= month; m++) {
            cv = (amount + cv) * (1 + mir);
        }
        System.out.printf("Amount in savings account after " + month + " months: $%.2f\n", cv);
    }
}
