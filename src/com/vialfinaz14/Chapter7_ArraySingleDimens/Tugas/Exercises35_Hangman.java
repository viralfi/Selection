package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises35_Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String play;

        do {
            char[] word = getword();
            char[] asterisks = new char[word.length];
            fillasterisks(asterisks);
            int missed = 0;
            do {
                char guess = getguess(asterisks);
                if (!iscorrecgues(word, asterisks, guess))
                    missed++;
            }while (!iswordfinish(asterisks));
            print(word, missed);
            System.out.println("Do you want to guess another word? enter" +
                    " y or n>");
            play = input.next();
        }while (play.charAt(0) == 'y');
    }
    public static char[] getword() {
        String[] words = {"write", "that", "program", "monkey", "rooster", "dog",
                "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                "horse", "sheep"};
        String pick = words[(int) (Math.random() * words.length)];
        char[] word = new char[pick.length()];
        for (int i = 0; i < word.length; i++) {
            word[i] = pick.charAt(i);
        }
        return word;
    }
    public static void fillasterisks(char[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = '*';
        }
    }
    public static boolean iscorrecgues(char[] word, char[] blanks, char guess) {
        boolean correct = false;
        int message = 2;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                correct = true;
                if (blanks[i] == guess)
                    message = 1;
                else {
                    blanks[i] = guess;
                    message = 0;
                }
            }
        }
        if (message > 0)
            print(message, guess);
        return correct;
    }
    public static boolean iswordfinish(char[] blank) {
        for (char e: blank) {
            if (e == '*')
                return false;
        }
        return true;
    }
    public static void print(char[] word, int missed) {
        System.out.print("The word is ");
        System.out.print(word);
        System.out.println(" You missed " + missed + " time");
    }
    public static void print(int m, char guess) {
        System.out.print("\t" + guess);
        switch (m) {
            case 1:
                System.out.println(" is already in the word");break;
            case 2:
                System.out.println(" is not in the word");
        }
    }
    public static char getguess(char[] asterisks) {
        Scanner input = new Scanner(System.in);
        System.out.print("(Guess) Enter a letter in word ");
        System.out.print(asterisks);
        System.out.print(" > ");
        String g = input.next();
        return g.charAt(0);
    }
}
