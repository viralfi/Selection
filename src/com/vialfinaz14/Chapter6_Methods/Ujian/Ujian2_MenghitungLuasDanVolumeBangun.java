package com.vialfinaz14.Chapter6_Methods.Ujian;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Ujian2_MenghitungLuasDanVolumeBangun {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("BANGUN RUANG");
        System.out.println("1.Prisma Segitiga");
        System.out.print("alas ");
        double alas = input.nextDouble();
        System.out.print("Tinggi segitiga ");
        double ts = input.nextDouble();
        System.out.print("Tinggi prisma ");
        double tp = input.nextDouble();
        prismasegitiga(alas, ts, tp);

        System.out.println("2.Bulat");
        System.out.print("radius ");
        double radius = input.nextDouble();
        System.out.print("length ");
        double length = input.nextDouble();
        Bulat(radius, length);

        System.out.print("3.");
    }
    public static void prismasegitiga(double alas,
                                double ts, double tp) {
        double ks = 2 * Math.pow(Math.pow(alas / 2, 2) +
                Math.pow(ts, 2), 0.5) + alas;
        double volume = ((1 * alas * ts) / 2) * tp;
        double luas = (2 * 1 / 2 * alas * ts) + (ks * tp);
        System.out.println("jadi besar volumnya " + volume +
                " dan luas permukaannya adalah " + String.format("%.2f", luas));
    }
    public static void Bulat(double radius, double length) {
        double pi = 3.14159;
        double luas = radius * radius * pi;
        double volume = luas * length;
        System.out.print("jadi besar volumenya " + String.format("%.1f", volume) +
                " dan luas permukaannya " + String.format("%.1f", luas));
    }
}
