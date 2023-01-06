package com.vialfinaz14.Chapter3.Ujian;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan jenis kelamin anda (L / P): ");
        String jk = input.nextLine();
        System.out.println("Masukan tinggi badan anda dalam cm: ");
        double tb = input.nextDouble();
        System.out.println("Masukan berat badan anda dalam kg: ");
        double bb = input.nextDouble();

        double tbm = tb / 100;
        double L = (tb - 100) - (0.1 * (tb - 100));
        double P = (tb - 100) - (0.15 * (tb - 100));
        double BMI = bb / Math.pow(tbm, 2);

        System.out.print("Jenis kelamin anda adalah ");
        switch (jk) {
            case "L":
                System.out.print("Laki-laki,");
            System.out.print("\nmaka berat badan ideal anda adalah " + String.format("%.1f", L ) + " kg ");break;
            case "P":
                System.out.print("Perempuan,");
            System.out.print("\nmaka berat badan ideal anda adalah " + String.format("%.1f", P ) + " kg ");break;
        }
        System.out.println("\nNilai BMI anda adalah " + String.format("%.2f", BMI) + ",maka kategori tubuh anda adalah ");

        if (BMI < 18.5)
            System.out.print("KURUS");
        if (BMI >18.5) if (BMI <= 24.9)
            System.out.print("IDEAL");
        if (BMI > 24.9) if (BMI <= 29.9)
            System.out.print("Kelebihan Berat Badan");
        if (BMI >= 30)
            System.out.print("OBESITAS");
    }
}
