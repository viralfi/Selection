package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class tugas9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String c = input.nextLine();
        char ch = c.charAt(0);
        System.out.println("the unicode for the character " + c + " is " + (int)ch);
    }
}
