package com.vialfinaz14.Chapter1.Ujian;

public class Soal4 {
    public static void main(String[] args) {

        double M = 50.0;
        double H = 2.0;
        double m = 30.0;
        double s = 45.0;

        double R = M / (H + (m / 60.0) + (s / 3600)) * 1.6;
        System.out.println("Miles /(Hour + (minute /60) + (second / 3600)) * 1.6");
        System.out.println("50.0  /(2.0  + (30.0  / 60) + (45.0   / 3600)) * 1.6");
        System.out.print("Kecepatan rata-rata dalam kilometer perjam adalah ");
        System.out.printf("%.2f", R);
        System.out.print(" KM/JAM");
    }
}
