package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises28_combinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];

        System.out.println("Enter ten number: ");
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextInt();

        printcombination(number);
    }
    public static void printcombination(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
