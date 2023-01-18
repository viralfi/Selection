package com.vialfinaz14.Chapter6_Methods.Latihan;

import java.util.Scanner;

public class Listing6_GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan bilangan bulat peretama: ");
        int n1 = input.nextInt();
        System.out.println("Masukan bilangan bulat kedua: ");
        int n2 = input.nextInt();
        System.out.println("The greatest common divisor for " + n1 +
                " dan " + n2 + " adalah " + gcd(n1, n2));
    }
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }
}
