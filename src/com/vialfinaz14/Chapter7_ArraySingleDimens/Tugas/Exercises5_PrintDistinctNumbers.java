package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises5_PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dn = new int[10];
        int num, count = 0;

        System.out.println("Enter ten number: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            if (isdistinct(dn, num)) {
                dn[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are");
        for (int i = 0; i < dn.length; i++) {
            if (dn[i] > 0)
                System.out.print(" " + dn[i]);
        }
        System.out.println();
    }
    public  static boolean isdistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}
