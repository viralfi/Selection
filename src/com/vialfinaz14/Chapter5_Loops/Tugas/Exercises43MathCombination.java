package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises43MathCombination {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = i + 1; j <8; j++) {
                System.out.println(i + " " + j);
                counter++;
            }
        }
        System.out.println("Total combination: " + counter);
    }
}