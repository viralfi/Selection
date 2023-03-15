package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Exercises8_UpdateCount {
    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile inout =
                        new RandomAccessFile("Exercises17_08.dat", "rw")
                ){
            if (inout.length() == 0) {
                inout.writeInt(1);
            }
            else {
                int count = inout.readInt();
                inout.seek(0);
                inout.writeInt(++count);
            }
        }
    }
}
//*********************************************************************************
// * (Update count) Suppose you wish to track how many times a program has been     *
// * executed. You can store an int to count the file. Increase the count by 1 each *
// * time this program is executed. Let the program be Exercise17_08 and store the  *
// * count in Exercise17_08.dat.                                                    *
// *********************************************************************************/