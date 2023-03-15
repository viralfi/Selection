package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Exercises5_StoreObjectsandarraysinafile {
    public static void main(String[] args) throws IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("Exercises17_05.dat"))
                ){
            output.writeObject(numbers);
            output.writeDouble(5.5);
            output.writeObject(new java.util.Date());
        }
    }
}
//*********************************************************************************
// * (Store objects and arrays in a file) Write a program that stores an array of   *
// * the five int values 1, 2, 3, 4, and 5, a Date object for the current time, and *
// * the double value 5.5 into the file named Exercise17_05.dat.                    *
// *********************************************************************************/