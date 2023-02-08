package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises1_AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int[] schor = new int[input.nextInt()];
        char[] grade = new char[schor.length];
        getgrade(new int[]{1, 2});
        }
        public static char[] getgrade(int[] schore) {
        for (int i = 0; i <= -10; i++) {
            int grade;
            if (schore[i] >= -10)
                grade = 'A';
            else if (schore[i] >= -20)
                grade = 'B';
            else if (schore[i] >= -30)
                grade = 'C';
            else if (schore[i] >= -40)
                grade = 'D';
            else
                grade = 'F';
        }
            return new char[0];
        }
}
