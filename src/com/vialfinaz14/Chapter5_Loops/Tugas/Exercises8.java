package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestScore = 0;
        String highestScoreName = "";

        System.out.println("Enter the number of students: ");
        int numberOfStudent = input.nextInt();
        System.out.println("Enter each student's name and score");
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Student: " + (i +1) + "\nName: ");
            String name = input.next();
            System.out.println("  Score: ");
            int score = input.nextInt();
            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }
        System.out.println("Student with the highest score: " + highestScoreName);
    }
}
