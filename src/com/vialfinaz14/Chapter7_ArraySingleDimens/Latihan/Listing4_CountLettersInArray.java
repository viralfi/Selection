package com.vialfinaz14.Chapter7_ArraySingleDimens.Latihan;

import com.vialfinaz14.Chapter6_Methods.Tugas.RandomCharacter;

public class Listing4_CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("The lowercase letters are: ");
        displayArray(chars);
        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }
    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        return chars;
    }
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a'] ++;
        return counts;
    }
    public static  void displayCounts(int[] count) {
        for (int i = 0; i < count.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(count[i] + " " + (char)(i + 'a'));
            else
                System.out.print(count[i] + " " + (char)(i + 'a') + " ");
        }
    }
}
