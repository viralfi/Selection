package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises44BitLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The bits are ");
        for ( int i = 15; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
    }
}
