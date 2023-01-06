package com.vialfinaz14.Chapter3.Latihan;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Ujian: ");
        double nilaiUjian = input.nextDouble();
        char indeksPrestasi;

        if (nilaiUjian >= 90)
        indeksPrestasi = 'A';
        else if (nilaiUjian >= 80)
        indeksPrestasi = 'B';
        else if (nilaiUjian >= 70)
        indeksPrestasi= 'C';
        else if (nilaiUjian >= 60)
        indeksPrestasi = 'D';
        else 
        indeksPrestasi = 'F';

        System.out.println(" Nilai ujian akhir anda adalah " + indeksPrestasi);
    }
}