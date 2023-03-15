package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Tugas;

public class Exercises10_OutOfMemoryError {
    public static void main(String[] args) {
        int length = 1200000000;
        try {
            byte[] array = new byte[length];
        }
        catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Error handled program continues...");
    }
}
