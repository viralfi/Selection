package com.vialfinaz14.Chapter8_ArrayMultidimensional.Ujian;

import java.util.Scanner;

public class Ujian_7dan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("PROGRAM APLIKASI REKAP NILAI");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.print("Inputan jumlah siswa: ");
        int jmlsiswa = input.nextInt();
        System.out.print("Inputan jumlah mata pelajaran: ");
        int jmlmapel = input.nextInt();

        String[] namasiswa = new String[jmlsiswa];
        String[] namamapel = new String[jmlmapel];

        System.out.println("*** INPUT MATA PELAJARAN ***");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.print("Input mata pelajaran ke " + (i + 1) + ": ");
            namamapel[i] = input.next();
        }
        double[][] nilaisiswa = new double[jmlsiswa][jmlmapel];
        double jmlnilai;
        double[] rata2nilaisiswa = new double[jmlsiswa];
        char[] indeknilaisiswa = new char[jmlsiswa];
        String[] keterangan = new String[jmlsiswa];


        System.out.println("*** INPUT SISWA DAN NILAI SETIAP MATA PELAJARAN ***");
        for (int i = 0; i < jmlsiswa; i++) {
            jmlnilai = 0;
            System.out.print("Input nama siswa ke " + (i + 1) + ": ");
            namasiswa[i] = input.next();
            for (int j = 0; j < jmlmapel; j++) {
                System.out.print("Input nilai " + namamapel[j] + ": ");
                nilaisiswa[i][j] = input.nextDouble();
                jmlnilai += nilaisiswa[i][j];
            }
            rata2nilaisiswa[i] = jmlnilai / jmlmapel;

            if (rata2nilaisiswa[i] >= 80)
                indeknilaisiswa[i] = 'A';
            else if (rata2nilaisiswa[i] >= 70)
                indeknilaisiswa[i] = 'B';
            else if (rata2nilaisiswa[i] >= 60)
                indeknilaisiswa[i] = 'C';
            else if (rata2nilaisiswa[i] >= 50)
                indeknilaisiswa[i] = 'D';
            else
                indeknilaisiswa[i] = 'E';

            if (indeknilaisiswa[i] == 'A')
                keterangan[i] = "Lulus dengan baik";
            else if (indeknilaisiswa[i] == 'B' || indeknilaisiswa[i] == 'C')
                keterangan[i] = "Lulus";
            else if (indeknilaisiswa[i] == 'D')
                keterangan[i] = "Lulus dengan syarat";
            else
                keterangan[i] = "Tidak lulus";
        }
        double[] rata2nilaimapel = new double[jmlmapel];
        double[] nilaitertinggi = new double[jmlmapel];
        double[] nilaiterendah = new double[jmlmapel];
        String[] siswaberprestasi = new String[jmlmapel];

        for (int i = 0; i < jmlmapel; i++) {
            double max = 0, min = 100, jumlahnilaimapel = 0;
            String namasiswaberprestasi = "";
            for (int j = 0; j < jmlsiswa; j++) {
                jumlahnilaimapel += nilaisiswa[j][i];

                if (nilaisiswa[j][i] > max) {
                    max = nilaisiswa[j][i];
                    namasiswaberprestasi = namasiswa[j];
                }
                if (nilaisiswa[j][i] < min) {
                    min = nilaisiswa[j][i];
                }
            }
            rata2nilaimapel[i] = jumlahnilaimapel / jmlsiswa;
            nilaitertinggi[i] = max;
            nilaiterendah[i] = min;
            siswaberprestasi[i] = namasiswaberprestasi;
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("*** DATA NILAI SISWA ***");
        System.out.println(" ");
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");
        System.out.printf("| %-5s | %-15s | ", "No", "Nama Siswa");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.printf("%-10s |", namamapel[i]);
        }
        System.out.printf("%-10s | %-5s | %-25s |\n", "Rata-rata", "Index", "Keterangan");
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");
        for (int i = 0; i < jmlsiswa; i++) {
            System.out.printf("| %-5d | %-15s |", i + 1, namasiswa[i]);
            for (int j = 0; j < jmlmapel; j++) {
                System.out.printf(" %-10s |", nilaisiswa[i][j]);
            }
            System.out.printf("%-10s | %-5s | %-25s |\n", rata2nilaisiswa[i], indeknilaisiswa[i], keterangan[i]);
        }
        System.out.print("-----------------------------");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.print("-------------");
        }

        System.out.print("----------------------------------------------\n");
        System.out.print("\nNilai rata-rata           | ");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.printf("%-10.2f | ", rata2nilaimapel[i]);
        }
        System.out.print("                                              | ");
        System.out.print("\nNilai Tertinggi           | ");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.printf("%-10.2f | ", nilaitertinggi[i]);
        }
        System.out.print("                                              | ");
        System.out.print("\nNilai Terendah            | ");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.printf("%-10.2f | ", nilaiterendah[i]);
        }
        System.out.print("                                              | ");

        System.out.print("\n-----------------------------");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.print("-------------");
        }
        System.out.print("----------------------------------------------\n");

        // print siswa berprestasi
        System.out.println("Siswa Berprestasi");
        for (int i = 0; i < jmlmapel; i++) {
            System.out.println((i + 1) + ". " + namamapel[i] + " = " + siswaberprestasi[i]);
        }
    }
}