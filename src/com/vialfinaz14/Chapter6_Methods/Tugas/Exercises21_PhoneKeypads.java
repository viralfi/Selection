package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises21_PhoneKeypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                System.out.print(getnumber(Character.toUpperCase(string.charAt(i))));
            else
                System.out.print(string.charAt(i));
        }
        System.out.println();
    }
    public static int getnumber(char uppercaseletter) {
        if (uppercaseletter >= 'w')
            return 9;
        if (uppercaseletter >= 'T')
            return 8;
        if (uppercaseletter >= 'P')
            return 7;
        if (uppercaseletter >= 'M')
            return 6;
        if (uppercaseletter >= 'J')
            return 5;
        if (uppercaseletter >= 'G')
            return 4;
        if (uppercaseletter >= 'D')
            return 3;
        else
            return 2;
    }
}
