package com.vialfinaz14.Chapter6_Methods.Tugas;

import com.vialfinaz14.Chapter6_Methods.Latihan.Listing7_PrimeNumberMethod;

public class Exercises10_UsetheisPrimeMethod {
    public static void main(String[] args) {
        int NOP = 0;
        for (int i = 1; i < 1000; i++) {
            if (Listing7_PrimeNumberMethod.isPrime(i))
                NOP++;
        }
        System.out.println("The number of prime numbers less than 10000: " + NOP);
    }
}
