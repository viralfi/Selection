package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.math.BigInteger;

public class Exercises19_MersennePrime {
    public static void main(String[] args) {
        System.out.println("p      2^p - 1");
        for (BigInteger p = new BigInteger("2");
        p.compareTo(new BigInteger("100")) < 0;
        p = p.add(new BigInteger("1"))) {
            if (isPrime(p)) {
                System.out.printf("%-3d", p);
                System.out.println("     " + mersennePrime(p));
            }
        }
    }
    public static BigInteger mersennePrime(BigInteger n) {
        BigInteger two = new BigInteger("2");
        BigInteger x = new BigInteger("2");
        for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0;
        i = i.add(new BigInteger("1"))) {
            x = x.multiply(two);
        }
        return x.subtract(new BigInteger("1"));
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
// * (Mersenne prime) A prime number is called a Mersenne prime if it can be        *
// * written in the form 2p - 1 for some positive integer p. Write a program that   *
// * finds all Mersenne primes with p … 100 and displays the output as shown below. *
// * (Hint: You have to use BigInteger to store the number, because it is too big   *
// * to be stored in long. Your program may take several hours to run.)             *
// *********************************************************************************/