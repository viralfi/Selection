package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises7_ComputeTheFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_YEARS = 30;

        System.out.println("\nThe amount invested: ");
        double amount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annual = input.nextDouble();
        double monthly = annual / 1200;

        System.out.println("Years    Future Value");
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n",
                    futureinvetmentvalue (amount, monthly, years));
        }
    }
    public static double futureinvetmentvalue(
            double investmentAmount, double Monthly, int years) {
        return investmentAmount * Math.pow(1 + Monthly, years * 12);
    }
}
