package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises33_ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox",
        "tiger", "rabbit", "dragon", "snake", "hourse", "sheep"};
        System.out.println("Enter a year: ");
        int years = input.nextInt();
        System.out.println(zodiac[years % 12]);
    }
}
