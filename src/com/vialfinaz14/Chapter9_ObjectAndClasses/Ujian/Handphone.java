package com.vialfinaz14.Chapter9_ObjectAndClasses.Ujian;

public class Handphone {
    private String pemilik;
    private String merk;
    private Double ukuran;

    public Handphone(String pemilik,
                     String merk, Double ukuran) {
        this.pemilik = pemilik;
        this.merk = merk;
        this.ukuran = ukuran;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getMerk() {
        return merk;
    }

    public Double getUkuran() {
        return ukuran;
    }

    public String turnonhp() {
        return "on";
    }
    public String turnofhp() {
        return "of";
    }
}
class bukaAplikasi extends Handphone{
    public bukaAplikasi(String pemilik, String merk, Double ukuran) {
        super(pemilik, merk, ukuran);
        turnonhp();
    }
    public void rincian() {
        System.out.println("Pemilik    : " + getPemilik());
        System.out.println("Merk       : " + getMerk());
        System.out.println("Ukuran     : " + getUkuran());
        System.out.println("keadaan    : " + turnonhp());
    }
}