package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises21CompareLoansWithVariousInterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount: ");
        double LA = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Interest Rate   Monthly Payment    Total Payment");

        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%          ");
            double mir = i / 1200;
            double mp = LA * mir / (1 - 1 / Math.pow(1 + mir, years * 12));
            System.out.printf("%-19.2f", mp);
            System.out.printf("%-8.2f\n", (mp * 12) * years);
        }
    }
}
