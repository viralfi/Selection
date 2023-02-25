package com.vialfinaz14.Chapter9_ObjectAndClasses.Latihan;

public class Listing9_TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields mycircle =
                new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius " +
                mycircle.getRadius() + " is " + mycircle.getArea());

        mycircle.setRadius(mycircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " +
                mycircle.getRadius() + " is " + mycircle.getArea());
        System.out.println("The number of objects created is " +
                CircleWithPrivateDataFields.getNumberofobject());
    }
}
