package com.vialfinaz14.Chapter11_InheritanceAndPolymorphis.Latihan;

public class Listing5_PolymorphismDemo {
    public static void main(String[] args) {
        displayobject(new CircleFromSimpleGeometricObject2
                (1, "red", false));
        displayobject(new RectangleFromSimpleGeometricObject
                (1, 1, "black", true));
    }
    public static void displayobject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
