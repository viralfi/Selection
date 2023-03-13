package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.util.Scanner;

public class Exercises5_DisplayThePrimeFaktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.println("The smallest factors of " + number + " are: ");
        StackOfInteger stack = new StackOfInteger();
        smallestFavtors(number, stack);

        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
        }
        System.out.println();
    }
    public static void smallestFavtors(int number, StackOfInteger  stack) {
        int i = 2;
        while (number / i != 1) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            }
            else
                i++;
        }
        stack.push(number);
    }
}
///*********************************************************************************
// * (Displaying the prime factors) Write a program that prompts the user to enter  *
// * a positive integer and displays all its smallest factors in decreasing order.  *
// * For example, if the integer is 120, the smallest factors are displayed as      *
// * 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors              *
// * (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.          *
// *********************************************************************************/