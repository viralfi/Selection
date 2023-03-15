package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises1_CreateATextFile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("Exercises17_01.txt");
        if (file.exists()) {
            try (
                    Scanner input = new Scanner(file);
                    ){
                while (input.hasNext()) {
                    list.add(input.nextLine());
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            list.add(((int) (Math.random() * 100)) + " ");
        }
        try (
                PrintWriter output = new PrintWriter(file)
                ){
            for (String l: list) {
                output.print(l);
            }
        }
    }
}
//************************************************************************************
// * (Create a text file) Write a program to create a file named Exercise17_01.txt if  *
// * it does not exist. Append new data to it if it already exists. Write 100 integers *
// * created randomly into the file using text I/O. Integers are separated by a space. *
// ************************************************************************************/