package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises3_CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        int[] count =new int[100];
        System.out.println("Enter the integers between 1 and 100: ");
       counts(count);

       for (int i = 0; i < count.length; i++) {
           if (count[i] > 0)
               System.out.println((i + 1) + " occurs " + count[i] +
                       " time " + (count[i] > 1 ? " s " : ""));
       }
    }
    public static void counts(int[] count) {
        Scanner input = new Scanner(System.in);
    int num;
    do {
        num = input.nextInt();
        if (num >= 1 && num <= 100)
            count[num - 1]++;
    }while (num != 0);
    }
}
