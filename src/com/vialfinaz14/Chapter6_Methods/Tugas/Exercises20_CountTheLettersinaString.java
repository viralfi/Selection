package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises20_CountTheLettersinaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input. nextLine();
        System.out.println("The number of letters in the string \"" +
                string + "\":  " + countLetters(string));
    }
    public static int countLetters(String s) {
        int numberofletter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                numberofletter++;
        }
        return numberofletter;
    }
}
