package com.vialfinaz14.Chapter11_InheritanceAndPolymorphis.Latihan;

public class CircleFromSimpleGeometricObject2
    extends SimpleGeometricObject {
private double radius;
public  CircleFromSimpleGeometricObject2() {
}
public  CircleFromSimpleGeometricObject2(double radius) {
    this.radius = radius;
}
public  CircleFromSimpleGeometricObject2(double radius, String color,
                                         boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
}
public double getRadius() {
    return radius;
}
public void setRadius(double radius) {
    this.radius = radius;
}
public double getArea() {
    return radius * radius * Math.PI;
}
public double getDiameter() {
    return 2 * radius;
}
public double getPerimeter() {
    return 2 * radius * Math.PI;
}
public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
            " and the radius is " + radius);
}
}
