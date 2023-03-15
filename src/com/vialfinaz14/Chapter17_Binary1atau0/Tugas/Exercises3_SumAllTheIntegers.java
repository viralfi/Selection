package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercises3_SumAllTheIntegers {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        try (
                DataInputStream input =
                        new DataInputStream(new FileInputStream("Exercises17_03.dat"))
                ){
            while (true)
                sum += input.readInt();
        }
        catch (EOFException ex) {
            System.out.println("Sum of the integers  is : " + sum);
        }
    }
}
//*********************************************************************************
// * (Sum all the integers in a binary data file) Suppose a binary data file named  *
// * Exercise17_03.dat has been created and its data are created using              *
// * writeInt(int) in DataOutputStream. The file contains an unspecified number of  *
// * integers. Write a program to find the sum of the integers.                     *
// *********************************************************************************/