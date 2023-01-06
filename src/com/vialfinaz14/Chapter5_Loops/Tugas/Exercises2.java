package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Exercises2 {
    public static void main(String[] args) {
        final  int NumberOfQuestions = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NumberOfQuestions) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math.random() * 15);
            System.out.println("What is " + number1 + " + " + number2 + " ?");
            int answer = input.nextInt();

            if (number1 + number2 == answer){
                System.out.println("You are correct");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 +
                        " + " + number2 + " should be " + (number1 + number2));
            count++;
            output += "\n" + number1 + "+" + number2 + "=" + answer +
                    ((number1 + number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest " +
                "time is " + testTime / 100 + " Seconds\n" + output);
    }
}
