package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Latihan;

import java.util.Scanner;

public class Listing1_TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualinterestrate = input.nextDouble();
        System.out.println("Enter number of years as an integer: ");
        int numberofyears = input.nextInt();
        System.out.println("Enter loan amount, for example, 120000.95: ");
        double lonamount = input.nextDouble();
        Listing2_Loan loan = new Listing2_Loan(annualinterestrate, numberofyears, lonamount);

        System.out.printf("The loan was created on %s\n" +
                         "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoandate().toString(), loan.getmonthlypayment(),
                loan.gettotalpayment());
   }
}

