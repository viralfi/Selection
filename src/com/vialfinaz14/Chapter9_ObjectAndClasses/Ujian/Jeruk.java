package com.vialfinaz14.Chapter9_ObjectAndClasses.Ujian;

import com.vialfinaz14.Chapter9_ObjectAndClasses.Ujian.Buah;

import java.text.DecimalFormat;

public class Jeruk extends Buah {

    public Jeruk(String nama, String warna) {
        super(nama, warna);
    }

    @Override
    public double perhitunganharga() {
        int sb = 2000;
        return 5 * sb;
    }

    @Override
    public void rincian() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Nama           : " + getNama());
        System.out.println("Warna          : " + getWarna());
        System.out.println("Harga 1 kilo   : " + df.format(perhitunganharga()));
    }
}
