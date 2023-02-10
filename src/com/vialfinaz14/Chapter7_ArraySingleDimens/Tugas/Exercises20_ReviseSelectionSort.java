package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises20_ReviseSelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
        selectionsort(numbers);
        for (double e: numbers)
            System.out.print(e + " ");
        System.out.println();
    }
    public static void selectionsort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            double currentmax = list[i];
            int currentmaxindex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (currentmax < list[j]) {
                    currentmax = list[j];
                    currentmaxindex = j;
                }
            }
            if (currentmaxindex != i) {
                list[currentmaxindex] = list[i];
                list[i] = currentmax;
            }
        }
    }
}
