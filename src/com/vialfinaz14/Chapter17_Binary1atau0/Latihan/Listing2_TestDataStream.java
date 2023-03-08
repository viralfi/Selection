package com.vialfinaz14.Chapter17_Binary1atau0.Latihan;

import java.io.*;

public class Listing2_TestDataStream {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream("temp.det"))
                ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
        try (
                DataInputStream input =
                        new DataInputStream(new FileInputStream("temp.dat"))
                ) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
