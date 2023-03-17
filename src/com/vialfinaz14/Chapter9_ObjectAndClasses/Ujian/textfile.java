package com.vialfinaz14.Chapter9_ObjectAndClasses.Ujian;

import com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas.Fan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class textfile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("hasil inputan user.txt");
        if (file.exists()) {
            try (
                    Scanner input = new Scanner(file)
                    ){
                while (input.hasNext()) {
                    list.add(input.nextLine());
                }
            }
        }
        list.add("vira");
        try (
                PrintWriter output = new PrintWriter(file)
                ){
            for (String l: list) {
                output.print(l);
            }
        }
    }

}
