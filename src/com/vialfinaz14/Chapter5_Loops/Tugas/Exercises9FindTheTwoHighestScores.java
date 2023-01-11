package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises9FindTheTwoHighestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudent = input.nextInt();
        int score, highest = 0, secondHigest = 0;
        String name = "", student1 = "", student2 = "";

        System.out.println("Enter each students' name and score: ");
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print("Student: " + (i + 1) + "\nName: ");
            name = input.next();
            score = input.nextInt();
            if (i == 0) {
                highest = score;
                student1 = name;
            }
            else if (i == 1 && score > highest) {
                secondHigest = score;
                student2 = name;
            }
            else  if (i > 1 && score > secondHigest) {
                student2 = name;
                secondHigest = score;
            }
        }
        System.out.println("Higest scoring student: " + student1 +
                "\nsecound Higest scoring student: " +student2);
    }
}
