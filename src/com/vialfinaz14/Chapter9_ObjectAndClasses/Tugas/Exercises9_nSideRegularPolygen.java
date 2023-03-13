package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

public class Exercises9_nSideRegularPolygen {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 =new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("\n-------------------------------------------------");
        System.out.println("|Regular polygon object  | Perimeter   | Area   |");
        System.out.println("-------------------------------------------------");
        System.out.printf("|       object# 1        |%8.2f     |%6.2f  |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf("|       object# 2        |%8.2f     |%6.2f  |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf("|       object# 3        |%8.2f     |%6.2f  |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("-------------------------------------------------");
    }
}
///*********************************************************************************
// * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides   *
// * have the same length and all angles have the same degree (i.e., the polygon is *
// * both equilateral and equiangular). Design a class named RegularPolygon that    *
// * contains:                                                                      *
// *                                                                                *
// * ■ A private int data field named n that defines the number of sides in the     *
// *   polygon with default value 3.                                                *
// * ■ A private double data field named side that stores the length of the side    *
// *   with  default value 1.                                                       *
// * ■ A private double data field named x that defines the x-coordinate of the     *
// *   polygon’s center with default value 0.                                       *
// * ■ A private double data field named y that defines the y-coordinate of the     *
// *   polygon’s center with default value 0.                                       *
// * ■ A no-arg constructor that creates a regular polygon with default values.     *
// * ■ A constructor that creates a regular polygon with the specified number of    *
// *   sides  and length of side, centered at (0, 0).                               *
// * ■ A constructor that creates a regular polygon with the specified number of    *
// *   sides,  length of side, and x- and y-coordinates.                            *
// * ■ The accessor and mutator methods for all data fields.                        *
// * ■ The method getPerimeter() that returns the perimeter of the polygon.         *
// * ■ The method getArea() that returns the area of the polygon. The formula for   *
// *   computing the area of a regular polygon is Area = (n x s^2) / (4 x tan(π / n)*
// *                                                                                *
// * Draw the UML diagram for the class and then implement the class. Write a test  *
// * program that creates three RegularPolygon objects, created using the no-arg    *
// * constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6,  *
// * 7.8). For each object, display its perimeter and area.                         *
// *********************************************************************************/