package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises10_FindTheIndexOfTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new  double[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();
        System.out.println("The minimum number is " +
                    numbers[iose(numbers)] + " index " +
                    iose(numbers));

    }
    public static int iose(double[] array) {
        if (array.length <= 1)
            return 0;
        double min = array[0];
        int minimumindex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumindex = i;
            }
        }
        return minimumindex;
    }
}
