package com.vialfinaz14.Chapter2.Ujian;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double rupiahPerDollars = 15665.50;

        System.out.print("masukan nomor Rupiah: ");
        double rupiah = input.nextDouble();

        double numberOfOneDollars = (rupiah / rupiahPerDollars);
        System.out.println("sama dengan " + String.format("%.2f", numberOfOneDollars) + " dollar");

    }
}
