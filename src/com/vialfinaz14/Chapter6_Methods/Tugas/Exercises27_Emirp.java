package com.vialfinaz14.Chapter6_Methods.Tugas;

import com.vialfinaz14.Chapter6_Methods.Latihan.Listing7_PrimeNumberMethod;

public class Exercises27_Emirp {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;
        int count = 0, n = 2;

        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n +
                        "\n" : n + " ");
            }
            n++;
        }
    }
    public static boolean isEmirp(int num) {
        return Listing7_PrimeNumberMethod.isPrime(num) &&
                !Exercises3_PalindromeInteger.isPalindrome(num) &&
                Listing7_PrimeNumberMethod.isPrime(Exercises3_PalindromeInteger.reverse(num));
    }
}
