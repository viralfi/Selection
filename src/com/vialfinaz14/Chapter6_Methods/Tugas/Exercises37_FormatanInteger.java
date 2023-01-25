package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Exercises37_FormatanInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number and its widht: ");
        int number = input.nextInt();
        int widht = input.nextInt();
        System.out.println(number + " formatted to width " + widht + ": " +
                format(number, widht));
    }
    public static String format(int number, int widht) {
        String num = number + "";
        if (num.length() < widht) {
            for (int i = widht - num.length(); i > 0;
            i--) {
                num = 0 + num;
            }
        }
        return num;
    }
}
