package com.vialfinaz14.Chapter6_Methods.Tugas;

public class Exercises1_pentagonalNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100;
        final int NUMBER_PER_LINE = 10;

        System.out.println("The first 100 pentagonal number, ten per line: ");
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            if (i % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
