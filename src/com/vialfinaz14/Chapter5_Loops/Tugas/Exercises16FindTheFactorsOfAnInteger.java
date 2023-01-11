package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises16FindTheFactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        int indeks = 2;

        while (number / indeks != 1) {
            if (number % indeks == 0) {
                System.out.println(indeks + ",");
                number /= indeks;
            }
            else
                indeks++;
        }
        System.out.println(number + ".");
    }
}
