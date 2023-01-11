package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises45MeanAndStandar {
    public static void main(String[] args) {
        double total = 0.0;
        double st = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        for (int i = 0; i < 10; i++) {
            double number = input.nextDouble();
            total += number;
            st += Math.pow(number, 2.0);
        }
        double deviation = Math.pow((st - total * total / 10.0) / 9.0, 0.5);
        double mean = total / 10.0;
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + String.format("%.5f", deviation));
    }
}
