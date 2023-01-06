package com.vialfinaz14.Chapter5.Latihan;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class Listing53GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Tebak angka ajaib antara 0 dan 100");
        int guess = -1;
        while (guess != number) {

            System.out.println("\nMasukan tebakanmu: ");
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Ya, nomornya adalah " + number);
            else if (guess > number)
                System.out.println("Tebakanmu terlalu tinggi ");
            else
                System.out.println("Tebakanmu terlalu rendah");
        }
    }
}
