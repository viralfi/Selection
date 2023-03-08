package com.vialfinaz14.Chapter11_InheritanceAndPolymorphis.Latihan;

public class Listing7_CastingDemo {
    public static void main(String[] args) {
        Object object1 = new CircleFromSimpleGeometricObject2(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1, 1);
        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object) {
        if (object instanceof CircleFromSimpleGeometricObject2) {
            System.out.println("The circle area is " +
                    ((CircleFromSimpleGeometricObject2)object).getArea());
            System.out.println("The circle diameter is " +
                    ((CircleFromSimpleGeometricObject2)object).getDiameter());
        }
        else if (object instanceof RectangleFromSimpleGeometricObject) {
            System.out.println("The rectangle area is " +
                    ((RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
