package com.vialfinaz14.Chapter6_Methods.Ujian;

import java.util.Scanner;


public class Ujian4_PenggajianKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double ts = 2023;

        System.out.print("Nama karyawan    : ");
        String nama = input.nextLine();
        System.out.print("Status           : ");
        String status = input.nextLine();
        System.out.print("Jumlah anak      : ");
        int anak = input.nextInt();
        System.out.print("Jarak Rmh-Kanor  : ");
        int jarak = input.nextInt();
        System.out.print("Jumlah Msk kerja : ");
        int masuk = input.nextInt();
        System.out.print("Tahun Masuk      : ");
        int tahun = input.nextInt();
        System.out.print("gaji pokok: ");
        int gaji = input.nextInt();
        int hari = masuk * 1000;
        int tk = (int) (ts - tahun);

        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Slip Gaji Karyawan februari " + ts);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Nama karyawan    : " + nama);
        System.out.println("Status           : " + status);
        System.out.println("Jumlah anak      : " + anak);
        System.out.println("Jarak Rmh-Kanor  : " + jarak + " KM");
        System.out.println("Jumlah Msk kerja : " + masuk + " Hari");
        System.out.println("Tahun Masuk      : " + tahun);
        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t|\tGaji pokok\t|\tT.Keluarga\t|\tT.Transportasi\t|\tT.Kesehatan\t|\t ");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("\t%,d\t", gaji);
        System.out.print("    | ");
        int tKeluarga = tunjangankeluarga(status, anak, gaji);
        int tTransfortasi = tunjanganTranfortasi(jarak, hari);
        int tKesehatan = tunjanganKesehatan(tk);
        int totalgaji = gaji + tKeluarga + tTransfortasi + tKesehatan;
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total gajih bulan februari " + ts + " : " + totalgaji);
        System.out.println("---------------------------------------------------------------------");

    }
    public static int tunjangankeluarga(String satus,
                                         double anak, int gaji) {
        switch (satus) {
            case "sudah menikah":
                if (anak == 0)
                    System.out.print( gaji * 0.05);
                else if (anak >= 1 && anak <= 3)
                    System.out.print( gaji * 0.075);
                else if (anak > 3)
                    System.out.print(gaji * 0.1);
                break;
            case "duda":
                if (anak == 0)
                    System.out.print(gaji * 0.03);
                 else if (anak > 0)
                    System.out.print(gaji * 0.05);
                break;
            case "janda":
                if (anak == 0)
                    System.out.print(gaji * 0.05);
                else if (anak > 0)
                    System.out.print(gaji * 0.075);
                break;
            case "single":
                System.out.print(0);
                break;
        }
        System.out.print("      |     ");
        return gaji;
    }
    public static int tunjanganTranfortasi(int jarak, int hari) {
        if (jarak <= 4)
            System.out.print(5000 * hari);
         else if (jarak >= 5 && jarak <= 10) {
            System.out.print(10000 * hari);
        } else if (jarak > 10) {
            System.out.print(15000 * hari);
            System.out.print("      |      ");
        }
        return jarak;
    }
    public static int tunjanganKesehatan(int tk) {
        if (tk < 2) {
            System.out.print(200000);
        }else if (tk >= 2 && tk <= 5) {
            System.out.print(500000);
        }else if (tk > 5) {
            System.out.print(750000);
        }
        return tk;
    }
}
