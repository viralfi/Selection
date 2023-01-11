package com.vialfinaz14.Chapter5.Latihan;

import java.util.Scanner;

public class Listing52GuessNumberOneTime {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("Tebak angka ajaib antara 0 dan 100");
        System.out.println("\nMasukkan tebakan Anda: ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println("Ya, nomornya adalah " + number);
        else if (guess > number)
            System.out.println("Tebakanmu terlalu tinggi");
        else
            System.out.println("Tebakanmu terlalu rendah");
    }
}
