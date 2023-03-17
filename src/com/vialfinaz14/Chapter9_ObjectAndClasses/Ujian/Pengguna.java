package com.vialfinaz14.Chapter9_ObjectAndClasses.Ujian;

public class  Pengguna{
    private int id_pengguna;
    private String nama;
    private String username;
    private String password;
    private int level;
    private String area_kerja;

    public Pengguna(int id_pengguna, String nama,
                    String username, String password,
                    int level, String area_kerja) {
        this.id_pengguna = id_pengguna;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.level = level;
        this.area_kerja = area_kerja;
    }

    public int getId_pengguna() {
        return id_pengguna;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getLevel() {
        return level;
    }

    public String getArea_kerja() {
        return area_kerja;
    }

    public void setId_pengguna(int id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setArea_kerja(String area_kerja) {
        this.area_kerja = area_kerja;
    }
}
