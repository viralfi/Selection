package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises22loanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount: ");
        double la = input.nextDouble();
        System.out.println("Number of Years: ");
        int years = input.nextInt();
        System.out.println("Anual Interest Rate: ");
        double annualRate = input.nextDouble();

        double monthlyRate = annualRate / 1200;
        double monthlyPayment = la * monthlyRate / (1 - 1 / Math.pow(1 +
                monthlyRate, years * 12));
        System.out.printf("Monthly payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

        double balance = la, principal, interest;
        System.out.println("Patment#     Interest     Principal    Balance");
        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
        }
    }
}
