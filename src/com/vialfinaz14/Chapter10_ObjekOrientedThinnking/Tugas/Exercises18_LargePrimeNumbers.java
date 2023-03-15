package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.math.BigInteger;

public class Exercises18_LargePrimeNumbers {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE +"");
        int count = 0;
        final int NUMBER_OF_PRIMES = 5;
        System.out.println();
        while (count < NUMBER_OF_PRIMES) {
            number = number.add(new BigInteger("1"));
            if (isPrime(number)) {
                count++;
                System.out.println(number);
            }
        }
    }
    public static boolean isPrime(BigInteger n) {
        for (BigInteger d = new BigInteger("2");
        d.compareTo(n.divide(new BigInteger("2"))) <= 0;
        d = d.add(new BigInteger("1"))) {
            if (n.remainder(d).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }
}
//*********************************************************************************
// * (Large prime numbers) Write a program that finds five prime numbers larger     *
// * than Long.MAX_VALUE.                                                           *
// *********************************************************************************/