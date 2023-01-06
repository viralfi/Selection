package com.vialfinaz14.Chapter3.Latihan;

import java.util.Scanner;

public class SubtractionQuiz2 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1< number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
        }
        System.out.print("What is " + number1 + " - " + number2 + " ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 - number2 == answer)
        System.out.println("Kamu benar!");
        else {
        System.out.println("Jawabamu salah. Yang benar adalah ");
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        }
    }
}