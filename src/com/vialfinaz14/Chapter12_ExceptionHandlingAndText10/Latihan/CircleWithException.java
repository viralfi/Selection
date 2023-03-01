package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

public class CircleWithException {
    private double radius;
    private static int numberofobject = 0;
    public CircleWithException() {
        this(1.0);
    }
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberofobject++;
    }
    public double getRadius() {
        return radius;
    }
    public  void setRadius(double newRadius)
        throws IllegalArgumentException {
            if (newRadius >= 0)
                radius = newRadius;
            else
                throw new IllegalArgumentException(
                        "Radius cannot be negative");
        }

    public static int getNumberofobject() {
        return numberofobject;
    }
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
