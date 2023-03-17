package com.vialfinaz14.Chapter9_ObjectAndClasses.Ujian;

public abstract class Buah {
    private String nama;
    private String warna;
    public abstract double perhitunganharga();
    public abstract void rincian();

    public Buah(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }
}
