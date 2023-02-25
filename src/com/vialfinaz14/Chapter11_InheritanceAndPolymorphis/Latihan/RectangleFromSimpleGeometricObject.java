package com.vialfinaz14.Chapter11_InheritanceAndPolymorphis.Latihan;

import java.util.PropertyResourceBundle;

public class RectangleFromSimpleGeometricObject
extends SimpleGeometricObject {
    private double width;
    private double heigh;
    public RectangleFromSimpleGeometricObject() {
    }
    public RectangleFromSimpleGeometricObject(double width,
                                              double heigh) {
        this.width = width;
        this.heigh = heigh;
    }
    public RectangleFromSimpleGeometricObject(double width, double heigh,
                                              String color, boolean filled) {
        this.width = width;
        this.heigh = heigh;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public double getArea() {
        return width * heigh;
    }
    public double getPerimeter() {
        return 2 * (width + heigh);
    }
}
