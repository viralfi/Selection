package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

public class Listing8_TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of object created: " +
                CircleWithException.getNumberofobject());
    }
}
