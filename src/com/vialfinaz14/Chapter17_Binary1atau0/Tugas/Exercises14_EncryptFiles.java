package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class Exercises14_EncryptFiles {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String inFile = input.next();
        System.out.println("Enter output file name: ");
        String outFile = input.next();
        try (
                RandomAccessFile source = new RandomAccessFile(inFile, "r");
                RandomAccessFile target = new RandomAccessFile(outFile, "rw")
                ){
            int r = 0;
            source.seek(0);
            while ((r = source.read()) != -1) {
                target.write(((byte)r) + 5);
            }
        }
    }
}
