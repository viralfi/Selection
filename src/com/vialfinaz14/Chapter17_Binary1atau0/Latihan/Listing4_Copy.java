package com.vialfinaz14.Chapter17_Binary1atau0.Latihan;

import java.io.*;

public class Listing4_Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetfile");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("source file " + args[0] +
                    " does not exist");
            System.exit(2);
        }
        File targetfile = new File(args[1]);
        if (targetfile.exists()) {
            System.out.println("Target file " + args[1] +
                    " already exists");
            System.exit(3);
        }
        try (
                BufferedInputStream input =
                        new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream output =
                        new BufferedOutputStream(new FileOutputStream(targetfile));
                ) {
            int r, numberOfBytescopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte)r);
                numberOfBytescopied++;
            }
            System.out.println(numberOfBytescopied + " bytes copied");
        }
    }
}
