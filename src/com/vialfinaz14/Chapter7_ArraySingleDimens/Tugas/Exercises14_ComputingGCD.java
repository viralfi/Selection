package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import java.util.Scanner;

public class Exercises14_ComputingGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(numbers));
    }

    public static int gcd(int... number) {
        int gcd = 1;
        boolean isdivisor;
        for (int i = 2; i < min(number); i++) {
            isdivisor = true;
            for (int e : number) {
                if (e % i != 0)
                    isdivisor = false;
            }
            if (isdivisor)
                gcd = i;
        }
            return gcd;
        }
        public static int min(int... numbers) {
        int min = numbers[0];
        for (int e: numbers) {
            if (e < min)
                min = e;
        }
        return min;
        }
}
