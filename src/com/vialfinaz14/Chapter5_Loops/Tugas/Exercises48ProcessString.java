package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises48ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();
        String oc = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                oc += s.charAt(i);
            }
        }
        System.out.println(oc);
    }
}
