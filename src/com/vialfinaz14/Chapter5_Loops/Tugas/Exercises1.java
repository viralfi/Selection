package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("No number are entered except 0");
            System.exit(1);
        }
        while (number != 0) {
            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }
        double average = total / count;
        System.out.println("The number of positive is " + positives + "\nThe number of negatives is " +
                negatives + "\nThe total is " + total + "\nThe average is " + average);
    }
}
