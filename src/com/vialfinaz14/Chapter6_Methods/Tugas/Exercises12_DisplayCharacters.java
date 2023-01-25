package com.vialfinaz14.Chapter6_Methods.Tugas;

public class Exercises12_DisplayCharacters {
    public static void main(String[] args) {
        final int  NUMBER_OF_CHARS_PER_LINE = 10;
        char ch1 = '1';
        char ch2 = 'z';

        System.out.println("\nCharachters per 1 to z");
        printChar(ch1, ch2, NUMBER_OF_CHARS_PER_LINE);
        System.out.println();
    }
    public static void printChar(char ch1, char ch2, int numberPerLine) {
        for (char c = ch1, count = 1; c <= ch2; c++, count++) {
            if (count % numberPerLine == 0)
                System.out.println(c);
            else
                System.out.print(c + " ");
        }
    }
}
