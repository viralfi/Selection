package com.vialfinaz14.Chapter4;

import java.util.Scanner;

public class tutorial_dasar {
    public static void main(String[] args) {
        String data1 = "UNPI Cianjur";
        String data2 = "Cianjur Jago";

        String sub_data1 = data1.substring(0, 4);
        String sub_data2 = data2.substring(0, 7);

        System.out.println(sub_data1);
        System.out.println(sub_data2);
    }
}

