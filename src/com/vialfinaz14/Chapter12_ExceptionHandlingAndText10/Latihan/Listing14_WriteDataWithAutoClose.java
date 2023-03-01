package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.io.FileNotFoundException;

public class Listing14_WriteDataWithAutoClose {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (
            java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
