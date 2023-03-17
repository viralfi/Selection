package com.vialfinaz14.Chapter9_ObjectAndClasses.Latihan;

public class CircleWithStaticMembers {
    double radius;
    static int numberofobject = 0;
    CircleWithStaticMembers() {
        radius = 1;
        numberofobject++;
    }
    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberofobject++;
    }
    static int getNumberofobject() {
        return numberofobject;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
}
