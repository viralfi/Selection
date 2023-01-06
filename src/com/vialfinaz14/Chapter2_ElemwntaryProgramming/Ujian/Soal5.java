package com.vialfinaz14.Chapter2.Ujian;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jarak perjalanan: ");
        double jarak = input.nextDouble();
        System.out.print("Konsumsi bahan bakar kendaraan dalam kilometer/liter: ");
        double bahanBakar = input.nextDouble();
        System.out.print("Dan harga bahan bakar: ");
        double liter = input.nextDouble();

        double harga = (jarak / bahanBakar) * liter;
        System.out.println("Maka total biaya perjalanan anda dalam " + String.format("%.0f", jarak) + " km adalah Rp." + String.format("%.0f", harga));
    }
}
