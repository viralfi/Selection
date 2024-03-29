package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.math.BigInteger;

public class Exercises16_DivisibleBy2Or3 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger n = new BigInteger(
                "100000000000000000000000000000000000000000000");
        BigInteger z = new BigInteger("0");
        while (count < 10) {
            if (z.compareTo(n.remainder(new BigInteger("2"))) == 0 ||
            z.compareTo(n.remainder(new BigInteger("3"))) == 0) {
                System.out.println(n);
                count++;
            }
            n = n.add(new BigInteger("1"));
        }
    }
}
