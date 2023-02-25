package com.vialfinaz14.Chapter9_ObjectAndClasses.Latihan;

public class CircleWithPrivateDataFields {
private double radius = 1;
private static int numberofobject = 0;
public CircleWithPrivateDataFields() {
    numberofobject++;
}
public CircleWithPrivateDataFields(double newRadius) {
    radius = newRadius;
    numberofobject++;
}
public double getRadius() {
    return radius;
}
public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
}
public static int getNumberofobject() {
    return numberofobject;
}
public double getArea() {
    return radius * radius * Math.PI;
}
}
