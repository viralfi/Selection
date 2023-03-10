package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises27_IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.println("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();
        System.out.println("Two lists are" + (equals(list1, list2) ? " " :
                " not " + "identical"));
    }
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        sort(list1);
        sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minindex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                list[minindex] = list[i];
                list[i] = min;
            }
        }
    }
}
