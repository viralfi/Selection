package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

public class Rektangle {
    double width;
    double height;
    Rektangle() {
        width = 1;
        height = 1;
    }
    Rektangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
