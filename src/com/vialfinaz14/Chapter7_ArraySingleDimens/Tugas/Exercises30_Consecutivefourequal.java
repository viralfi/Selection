package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises30_Consecutivefourequal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers of value: ");
        int[] values = new int[input.nextInt()];
        System.out.println("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();
        System.out.println("The list has" + (isconsecutivefour(values) ?
                 " " : " no ") + "consecutive fours");
    }
    public static boolean isconsecutivefour(int[] values) {
        int count = 1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == values[i + 1])
                count++;
            if (count >= 4)
                return true;
            if (values[i] != values[i + 1])
                count = 1;
        }
        return false;
    }
}
