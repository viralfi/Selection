package com.vialfinaz14.Chapter17_Binary1atau0.Latihan;

import java.io.*;

public class Listing7_TestObjectStreamForArray {
    public static void main(String[] args)
    throws  ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};
        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("array.dat", true))
                ){
            output.writeObject(numbers);
            output.writeObject(strings);
        }
        try (
                ObjectInputStream input =
                        new ObjectInputStream(new FileInputStream("array.dat"))
                ) {
            int[] newNumber = (int[]) (input.readObject());
            String[] newString = (String[]) (input.readObject());
            for (int i = 0; i < newNumber.length; i++)
                System.out.print(newNumber[i] + " ");
            System.out.println();
            for (int i = 0; i < newString.length; i++)
                System.out.print(newString[i] + " ");
        }
    }
}
