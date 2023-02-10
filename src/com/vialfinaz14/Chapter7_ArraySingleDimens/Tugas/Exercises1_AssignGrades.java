package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises1_AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int[] score = new int[input.nextInt()];
        char[] grade = new char[score.length];

        System.out.println("Enter " + score.length + " score: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }
        getgrade(score, grade);
        for (int i = 0; i < score.length; i++) {
            System.out.println("student " + i + " score is " +
                    score[i] + " and grade is " + grade[i]);
        }
        }
        public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
        }
        public static void getgrade(int[] schore, char[] grade) {
        int best = max(schore);
        for (int i = 0; i < schore.length; i++) {
            if (schore[i] >= best -10)
                grade[i] = 'A';
            else if (schore[i] >= best -20)
                grade[i] = 'B';
            else if (schore[i] >= best -30)
                grade[i] = 'C';
            else if (schore[i] >= best -40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }
        }
}
