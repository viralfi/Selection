package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whemBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whemBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhemBuilt() {
        return whemBuilt;
    }
    @Override
    public Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
}
