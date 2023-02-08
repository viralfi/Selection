package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises4_AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score: (negative number signitif end) : ");

        int[] score = new int[100];
        int num;
        int numberos;
        int average;
        numberos = average = 0;
        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0) break;
            score[i] = num;
            average += num;
            numberos++;
        }
        average /= numberos;
        int aboveorequel, below;
        aboveorequel = below = 0;
        for (int i = 0; i < numberos; i++) {
            if (score[i] >= average)
                aboveorequel++;
            else
                below++;
        }
        System.out.println("\nAverage of score: " + average);
        System.out.println("Number of score above or equal to average: " +
                aboveorequel);
        System.out.println("Number of score below average: " + below);
    }
}
