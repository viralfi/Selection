package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

public class Exercises1_TheRectangleclass {
    public static void main(String[] args) {
        Rektangle rectangle1 = new Rektangle(4, 40);
        Rektangle rectangle2 = new Rektangle(3.5, 35.9);

        System.out.println("\n Rectangle 1");
        System.out.println("--------------");
        System.out.println("Width:       " + rectangle1.width);
        System.out.println("Height:      " + rectangle1.height);
        System.out.println("Area:        " + rectangle1.getArea());
        System.out.println("Perimeter:   " + rectangle1.getPerimeter());

        System.out.println("\n Rectangle 2");
        System.out.println("--------------");
        System.out.println("Width:      " + rectangle2.width);
        System.out.println("Height:     " + rectangle2.height);
        System.out.println("Area:       " + rectangle1.getArea());
        System.out.println("Perimeter:  " + rectangle1.getPerimeter());
    }
}
