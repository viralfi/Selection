package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.io.File;
import java.io.IOException;

public class Listing13_WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("score.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        output.close();
    }
}