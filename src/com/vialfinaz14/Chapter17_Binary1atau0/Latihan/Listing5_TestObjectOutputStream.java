package com.vialfinaz14.Chapter17_Binary1atau0.Latihan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Listing5_TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream output =
                        new ObjectOutputStream(new FileOutputStream("object.dat"))
                ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }
}
