package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises22_ApproximateTheSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = input.nextLong();
        System.out.println("The approximated square root of " +
                number + " is: " + sqrt(number));
    }
    public static double sqrt(long n) {
        long lastguess = 1;
        long nextguess = (lastguess + n / lastguess) / 2;
        while (nextguess - lastguess > 0.0001) {
            lastguess = nextguess;
            nextguess = (lastguess + n / lastguess) / 2;
        }
        lastguess = nextguess;
        return nextguess = (lastguess + n / lastguess) / 2;
    }
}
