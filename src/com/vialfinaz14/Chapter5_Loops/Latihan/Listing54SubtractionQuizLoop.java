package com.vialfinaz14.Chapter5.Latihan;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Listing54SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NumberOfQuetions = 5;
        int correctCount = 0;
        int Count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (Count < NumberOfQuetions) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " + number1 + " - " + number2 + " ?" );
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 +
                        " - " + number2 + " should be " + (number1 - number2));
            Count++;
            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct " : " wrong ");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " +
                testTime / 100 + " seconds" + output);
    }
}
