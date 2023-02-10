package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;
import java.util.stream.Stream;

public class Exercises18_BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
        bubblesort(numbers);
        for (double e: numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void bubblesort(double[] list) {
        double temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        }while (swapped);
    }
}

