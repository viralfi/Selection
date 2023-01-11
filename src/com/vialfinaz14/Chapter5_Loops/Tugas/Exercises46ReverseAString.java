package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises46ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.next();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("The reverse string is " + reverse);
    }
}
