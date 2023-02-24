package com.vialfinaz14.Chapter9_ObjectAndClasses.Latihan;

public class Listing7_TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating object");
        System.out.println("The number of circle object is " +
                CircleWithStaticMembers.numberofobject);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("\nAfter creatif c1");
        System.out.println("c1: radius (" +c1.radius + ") and number of " +
                "circle object (" + c1.numberofobject + ")");

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of circle object (" + c1.numberofobject + ")");
        System.out.println("c2: radius (" + c2.radius +
                ") and number of circle object (" + c2.numberofobject + ")");
    }
}
