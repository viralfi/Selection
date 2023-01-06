package com.vialfinaz14.Chapter4.Tugas;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class tugas8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        double c = input.nextDouble();

        System.out.println("The ASCII code for character " + String.format("%.0f", c) + " is " + (char)c);
    }
}
