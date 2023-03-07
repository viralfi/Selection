package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan;

public class Listing4_TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoObjek1 = new Circle(5);
        GeometricObject geoObjek2 = new Rectangle(5, 3);
        System.out.println("The two objects have the same area? " +
                equalArea(geoObjek1, geoObjek2));

        displayGeometriObject(geoObjek1);
        displayGeometriObject(geoObjek2);
    }
    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
    public static void displayGeometriObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
