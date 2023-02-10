package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises34_SortCharactersinaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();
        System.out.println(sort(string));
    }
    public static char[] sort(String s) {
        char[] str = new char[s.length()];
        for (int i = 0; i < str.length; i++)
            str[i] = s.charAt(i);
        for (int i = 0; i < str.length - 1; i++) {
            char min = str[i];
            int minindex = i;
            for (int j = i + 1; j < str.length; j++) {
                if (min > str[j])
                    min = str[j];
                minindex = j;
            }
            if (minindex != i) {
                str[minindex] = str[i];
                str[i] = min;
            }
        }
        return str;
    }
}
