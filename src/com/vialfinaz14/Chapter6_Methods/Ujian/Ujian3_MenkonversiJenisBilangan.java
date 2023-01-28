package com.vialfinaz14.Chapter6_Methods.Ujian;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Ujian3_MenkonversiJenisBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 7 :
                System.out.println("Mengkonversi Desimal ke Biner");
                System.out.print("Masukan Nilai Desimal: ");
                int des = input.nextInt();
                deskebin(des);break;
            case 8 :
                System.out.println("Mengkonversi bilangan Desimal ke oktal");
                System.out.print("Masukan Nilai desimal: ");
                int des1 = input.nextInt();
                deskeokt(des1);break;
            case 9 :
                System.out.println("Mengkonversi bilangan Desimal ke heksa");
                System.out.print("Masukan nilai Desimal: ");
                int des2 = input.nextInt();
                deskehex(des2);break;
        }
    }
    public static void deskebin(int des) {
        StringBuilder biner = new StringBuilder();
        for (int i = des; i > 0; i /= 2 ) {
            biner.insert(0, (i % 2));
        }
        System.out.println("Nilai biner dari Desimal " + des +
                " adalah " + biner);
    }
    public static void deskeokt(int des1) {
        String okt = "";
        for (int i = des1; i > 0; i/= 8) {
            okt = (i % 8) + okt;
        }
        System.out.println("Nilai oktal dari desimal " + des1 +
                " adalah " + okt);
    }
    public static void deskehex(int des2) {
        StringBuilder hek = new StringBuilder();
        System.out.print("Nilai heksa dari desimal " + des2);
        while (des2 != 0) {
            int v = des2 % 16;
            char ch = (v >= 0 && v <= 9) ?
                    (char) (v + '0') : (char) (v - 10 + 'A');
            hek.insert(0,ch);
            des2 = des2 / 16;
        }
        System.out.println(" adalah " + hek);
    }
}
