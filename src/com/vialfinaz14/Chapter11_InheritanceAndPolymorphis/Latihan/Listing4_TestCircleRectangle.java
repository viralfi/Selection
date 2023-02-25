package com.vialfinaz14.Chapter11_InheritanceAndPolymorphis.Latihan;

public class Listing4_TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject2 circle =
                new CircleFromSimpleGeometricObject2(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject retangle =
                new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + retangle.toString());
        System.out.println("The area is " + retangle.getArea());
        System.out.println("The perimeter is " + retangle.getPerimeter());
    }
}
