package com.vialfinaz14.Chapter17_Binary1atau0.Latihan;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Listing8_TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw")
                ) {
            inout.setLength(0);
            for (int i = 0; i < 200; i++)
                inout.writeInt(i);
            System.out.println("Current file length is " + inout.length());
            inout.seek(0);
            System.out.println("Current file length is " + inout.readInt());
            inout.seek(1 * 4);
            System.out.println("Current file length is " + inout.readInt());
            inout.seek(9 * 4);
            System.out.println("Current file length is " + inout.readInt());
            inout.writeInt(555);
            inout.seek(inout.length());
            inout.writeInt(999);
            System.out.println("The new length is " + inout.length());
            inout.seek(10 * 4);
            System.out.println("The eleventh number is " + inout.readInt());
        }
    }
}
