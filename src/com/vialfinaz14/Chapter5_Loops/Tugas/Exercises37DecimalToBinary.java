package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises37DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal interger: ");
        int decimal = input.nextInt();
        String binary = "";
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }
        System.out.println("The binary value of the decimal \"" + decimal + "\"" +
                "is : " + binary);
    }
}
