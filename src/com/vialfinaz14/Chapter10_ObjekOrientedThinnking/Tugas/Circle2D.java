package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.sql.ResultSet;

public class Circle2D {
    private double x;
    private double y;
    private double radius;
    Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2)) < radius;
    }
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= Math.abs(radius - circle.getRadius());
    }
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
    }
}
///**************************************************
// *                     Circle2D                    *
// *-------------------------------------------------*
// * -x: double                                      *
// * -y: double                                      *
// * -radius: double                                 *
// * +Circle2D()                                     *
// * +Circle2D(x: double, y: double, radius: double) *
// * +getX(): double                                 *
// * +getY(): double                                 *
// * +getRadius(): double                            *
// * +getArea(): double                              *
// * +getPerimeter(): double                         *
// * +contains(x: double, y: double): boolean        *
// * +contains(Circle2D: circle): boolean            *
// * +overlaps(Circle2D: circle): boolean            *
// **************************************************/