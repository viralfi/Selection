package com.vialfinaz14.Chapter6_Methods.Tugas;

import com.vialfinaz14.Chapter6_Methods.Latihan.Listing7_PrimeNumberMethod;

public class Exercises28_MersennePrime {
    public static void main(String[] args) {
        System.out.println("\np         2^p-1");
        System.out.println("-----------------");
        for (int p = 2; p <= 31; p++) {
            if (Listing7_PrimeNumberMethod.isPrime(p)) {
                System.out.printf("%-13d", p);
                System.out.println(mersennePrime(p));
            }
        }
    }
    public static int mersennePrime(int num) {
        return (int) Math.pow(2, num) - 1;
    }
}
