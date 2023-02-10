package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises15_EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        for (int i =0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
        int[] distincnumber= eliminateduplicate(numbers);
        System.out.println("The distinct number are: ");
        for (int e: distincnumber) {
        if (e > 0)
            System.out.print(" " + e);
    }
        System.out.println();
}
public static int[] eliminateduplicate(int[] list) {
        int[] distinct = new int[list.length];
        int i = 0;
        for (int e : list) {
            if (linearsearc(distinct, e) == -1) {
                distinct[i] = e;
                i++;
            }
        }
        return distinct;
}
public static int linearsearc(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
}
}
