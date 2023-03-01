package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

public class Listing11_TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of object created: " +
                CircleWithCustomException.getNumberOfObject());
    }
}
class CircleWithCustomException {
    private double radius;
    private static int numberOfObject = 0;
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObject++;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius)  throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }
    public static int getNumberOfObject() {
        return numberOfObject;
    }
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
