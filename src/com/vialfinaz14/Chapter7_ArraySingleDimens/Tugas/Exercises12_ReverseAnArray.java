package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises12_ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
        reverse(numbers);
        for (int e: numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] list) {
        int temp;
        for (int i = 0, j = list.length - 1; i < list.length / 2;
        i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
