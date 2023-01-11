package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;

public class tugas11DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter binary digits (0000 to 1111): ");
        double decimal = input.nextDouble();

        if (decimal >= 0 && decimal <= 9)
            System.out.println("The hex value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("The hex value is " + (char)(decimal + 'A' -10));
        else
            System.out.println(decimal + " is an invalid input");
    }
}
