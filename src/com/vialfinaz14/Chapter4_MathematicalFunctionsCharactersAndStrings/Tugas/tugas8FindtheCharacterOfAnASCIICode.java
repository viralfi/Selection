package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;

public class tugas8FindtheCharacterOfAnASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        double c = input.nextDouble();

        System.out.println("The ASCII code for character " + String.format("%.0f", c) + " is " + (char)c);
    }
}
