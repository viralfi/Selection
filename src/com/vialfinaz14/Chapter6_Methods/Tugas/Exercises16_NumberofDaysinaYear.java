package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises16_NumberofDaysinaYear {
    public static void main(String[] args) {
        System.out.println("year      Days in year");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "      " + numberofdaysinyears(year));
        }
    }
    public static int numberofdaysinyears(int year) {
        if (isleapyear(year))
            return 366;
        else
            return 365;
    }
    public static boolean isleapyear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
