package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class tugas20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(str + " has a leng of " + str.length() +
                " and its first character is " + str.charAt(0));
    }
}
