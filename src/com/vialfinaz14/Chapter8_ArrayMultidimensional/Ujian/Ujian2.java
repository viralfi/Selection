package com.vialfinaz14.Chapter8_ArrayMultidimensional.Ujian;

public class Ujian2 {
    public static void main(String[] args) {
        String[] mapel = {"Biologi", "Fisika", "Kimia", "Matematika", "Inggris"};
        String[] namasiswa = {"Vira", "Ina", "Riman", "Nahda", "Zahra",
                "Syifa", "Hikmah", "Arini", "Robby", "Nadine"};
        double[][] score = {
                {90, 90, 80, 70, 80}, {70, 80, 80, 80, 80},
                {85, 65, 80, 70, 80}, {90, 90, 80, 70, 80},
                {90, 90, 80, 70, 80}, {90, 90, 80, 70, 80},
                {90, 90, 80, 70, 80}, {90, 90, 80, 70, 80},
                {90, 90, 80, 70, 80}, {90, 90, 80, 70, 80},
        };
        double[] rata2 = {90, 80, 70, 80, 60, 70, 60, 90, 80, 70};
        String[] indek = {"A", "A", "B", "A", "C", "B", "C", "A", "A", "B"};

        System.out.println(" -----------------------------------------------------------------------------------------------------------------------");
        System.out.printf (" | %-3s | %-10s |", "No", "Nama Siswa");
        for (int i = 0; i < mapel.length; i++) {
            System.out.printf(" %-8s | ",  mapel[i]);
        }
        System.out.printf("%-10s | %-5s | %-5s |", "Rata-rata", "Index", "Keterangan");
        System.out.println("\n -----------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < namasiswa.length; i++) {
                System.out.printf(" | %-3d |%-10s |\n", i + 1, namasiswa[i]);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%.0f |", score[j][i]);
            }
        }
    }
}
