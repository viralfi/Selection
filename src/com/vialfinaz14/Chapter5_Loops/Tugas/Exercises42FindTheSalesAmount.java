package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises42FindTheSalesAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double commission;
        double salesAmount = 0.01;

        System.out.print("Enter commission amount: ");
        double customCommission = input.nextInt();
        for (commission = 0; commission < customCommission;  salesAmount += 0.01) {
            if (salesAmount >= 10000.01) {
                commission = 900.0 + (salesAmount - 10000.0) * 0.12;
            } else if (salesAmount >= 5000.01) {
                commission = 400.0 + (salesAmount - 5000.0) * 0.1;
            } else {
                commission = salesAmount * 0.08;
            }
        }

        System.out.println("You need $" + (int)(salesAmount * 100.0) / 100.0 +
                " sales amount to make a commission of $" + customCommission);
    }
}
