package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises49VowelsAndConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = input.nextLine();
        int vowels, consonant;
        vowels = consonant = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (Character.toUpperCase(string.charAt(i)) == 'A' ||
                        Character.toUpperCase(string.charAt(i)) == 'E' ||
                        Character.toUpperCase(string.charAt(i)) == 'I' ||
                        Character.toUpperCase(string.charAt(i)) == 'O' ||
                        Character.toUpperCase(string.charAt(i)) == 'U' ) {
                    vowels++;
                }
                else
                    consonant++;
            }
            System.out.println("The number of vowels is " + vowels);
            System.out.println("The number of consonants is " + consonant);
        }
    }
}
