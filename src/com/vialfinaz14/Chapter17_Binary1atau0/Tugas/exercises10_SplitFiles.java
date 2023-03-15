package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class exercises10_SplitFiles {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Exercises_17_10 sourceFile numberOfPieces");
            System.exit(1);
        }
        int numberOfPiece = Integer.parseInt(args[1]);
        RandomAccessFile[] splits = new RandomAccessFile[numberOfPiece];
        try (
                RandomAccessFile inout = new RandomAccessFile(args[0], "r")
                ){
            for (int i = 0; i < splits.length; i++) {
                splits[i] = new RandomAccessFile(args[0] + "." + (i + 1), "rw");
            }
            int size = Math.round(inout.length() / numberOfPiece);
            int count = 0;
            byte[] b;
            for (int i = 0; i < numberOfPiece - 1; i++) {
                inout.seek(count * size);
                b = new byte[size];
                inout.read(b);
                splits[i].write(b);
                count++;
            }
            inout.seek(count * size);
            b = new byte[(int) inout.length() - (count * size)];
            inout.read(b);
            splits[numberOfPiece - 1].write(b);
        }
    }
}
//*********************************************************************************
// * (Split files) Suppose you want to back up a huge file (e.g., a 10-GB AVI file) *
// * to a CD-R. You can achieve it by splitting the file into smaller pieces and    *
// * backing up these pieces separately. Write a utility program that splits a      *
// * large file into smaller ones using the following command:                      *
// *                                                                                *
// * java Exercise17_10 SourceFile numberOfPieces                                   *
// *                                                                                *
// * The command creates the files SourceFile.1, SourceFile.2, . . . , SourceFile.n *
// * where n is numberOfPieces and the output files are about the same size.        *
// *********************************************************************************/