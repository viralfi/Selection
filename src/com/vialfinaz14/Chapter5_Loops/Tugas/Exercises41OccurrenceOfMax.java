package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises41OccurrenceOfMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int occurrence = 0;
        int number;

        System.out.print("Enter numbers: ");
        do {
            number = input.nextInt();
            if (number > largest) {
                occurrence = 0;
                largest = number;
            }
            if (number == largest) {
                occurrence++;
            }

        } while (number != 0);
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count of the largest number is " + occurrence);
    }
}
