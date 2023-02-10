package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Exercises17_SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of student: ");
        String[] student = new String[input.nextInt()];
        int[] score = new int[student.length];

        System.out.println("Enter the name a score for each student: ");
        for (int i = 0; i < student.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            student[i] = input.next();
            System.out.print("Score: ");
            score[i] = input.nextInt();
        }
        sortderction(student, score);
        for (String e: student) {
            System.out.println(e);
        }
    }
    public static void sortderction(String[] student, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxindex = i;
            String temp;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxindex = j;
                }
            }
            if (maxindex != i) {
                temp = student[i];
                student[i] = student[maxindex];
                student[maxindex] = temp;
                nums[maxindex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
