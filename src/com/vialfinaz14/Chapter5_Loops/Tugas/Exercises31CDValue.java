package com.vialfinaz14.Chapter5_Loops.Tugas;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Exercises31CDValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter annual percentage yield: ");
        double py = input.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        int month = input.nextInt();

        System.out.println("Month CD value");
        for (int m = 1; m <= month; m++) {
            amount += amount * (py / 1200);
            System.out.printf("%-7d%.2f\n", m, amount);
        }
    }
}
