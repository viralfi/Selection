package com.vialfinaz14.Chapter2.Tugas;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KilogramPerPound = 0.454;

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilogram = pounds * KilogramPerPound;
        System.out.println(pounds + " pounds is " + kilogram + " kilograms");
    }
}
