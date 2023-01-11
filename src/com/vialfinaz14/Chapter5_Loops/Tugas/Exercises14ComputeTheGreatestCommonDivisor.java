package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises14ComputeTheGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter firt integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = n1 < n2 ? n1 : n2;
        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd++;
        }
        System.out.println("Pembagi persekutuan terbesar untuk " + n1 + " dan " +
                n2 + " adalah " + gcd);
    }
}
