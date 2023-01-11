package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises15DisplayTheASCIICharacterTable {
    public static void main(String[] args) {
        final int NumberOfCharactersPerLine = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            count++;
            if (count % 10 == 0)
                System.out.println((char) i);
            else
                System.out.println((char) i + " ");
        }
        System.out.println();
    }
}
