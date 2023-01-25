package com.vialfinaz14.Chapter6_Methods.Tugas;

import com.vialfinaz14.Chapter6_Methods.Latihan.Listing7_PrimeNumberMethod;

public class Exercises29_TwinPrimes {
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (isTwinprime(p))
                System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }
    public static boolean isTwinprime(int num) {
        return Listing7_PrimeNumberMethod.isPrime(num) && Listing7_PrimeNumberMethod.isPrime(num + 2);
    }
}
