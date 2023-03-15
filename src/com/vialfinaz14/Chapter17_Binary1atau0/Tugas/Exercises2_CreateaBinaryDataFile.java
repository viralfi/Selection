package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercises2_CreateaBinaryDataFile {
    public static void main(String[] args) throws IOException {
        try(
                FileOutputStream output = new
                        FileOutputStream("Exercises17_02.dat", true)
                ){
            for (int i = 0; i < 100; i++)
                output.write((int) (1 + Math.random() * 100));
        }
    }
}
//*********************************************************************************
// * (Create a binary data file) Write a program to create a file named             *
// * Exercise17_02.dat if it does not exist. Append new data to it if it already    *
// * exists. Write 100 integers created randomly into the file using binary I/O.    *
// *********************************************************************************/