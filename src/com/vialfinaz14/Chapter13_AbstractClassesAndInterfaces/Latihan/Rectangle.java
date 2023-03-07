package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Rectangle extends GeometricObject {
    private double width;
    private double heigh;
    public Rectangle() {
    }
    public Rectangle(double width,
                                              double heigh) {
        this.width = width;
        this.heigh = heigh;
    }
    public Rectangle(double width, double heigh,
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

