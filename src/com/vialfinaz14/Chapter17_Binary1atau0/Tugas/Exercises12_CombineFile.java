package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Exercises12_CombineFile {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java Exercises_17_12 sourceFile1 . . . sourceFilen TargetFile");
            System.exit(0);
        }
        RandomAccessFile[] source = new RandomAccessFile[args.length - 1];
        try (
                RandomAccessFile target = new
                        RandomAccessFile(args[args.length - 1], "rw")
                ){
            for (int i = 0; i < source.length; i++) {
                source[i] = new RandomAccessFile(args[i], "r");
            }
            for (int i = 0; i < source.length; i++) {
                byte[] b = new byte[(int) source[i].length()];
                source[i].seek(0);
                source[i].read(b);
                target.seek(target.length());
                target.write(b);
            }
        }
    }
}
