package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises5_SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaysortedNumbers(number1, number2, number3);
    }
    public static void displaysortedNumbers(double num1, double num2,
                                            double num3) {
        double temp;
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " +  num2 + " " + num3);
    }
}
