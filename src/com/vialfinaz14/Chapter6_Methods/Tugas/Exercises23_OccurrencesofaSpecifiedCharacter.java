package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises23_OccurrencesofaSpecifiedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string followed by a character e.g. welcome, e: ");
        String string = input.nextLine();
        int k = string.indexOf(", ");
        String str = string.substring(0, k);
        char ch = string.charAt(k + 2);
        System.out.println("The number of occurences of \"" + ch +
                "\" in \"" + str + "\" is: " + count(str, ch));
    }
    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}
