package com.vialfinaz14.Chapter5_Loops.Tugas;

import com.sun.source.doctree.BlockTagTree;

import java.awt.*;
import java.util.Scanner;

public class Exercises32Lottery {
    public static void main(String[] args) {
        int lt1, lt2;
        lt1 = (int) (Math.random() * 10);
        do {
            lt2 = (int) (Math.random() * 10);
        } while (lt1 == lt2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        int guess = input.nextInt();
        int gd1 = guess / 10;
        int gd2 = guess % 10;
        System.out.println("The lottery number is " + lt1 + lt2);

        if (gd1 == lt1 && gd2 == lt2)
            System.out.println("Exact match: you win $10,000");
        else if (gd2 == lt1 && gd1 == lt2)
            System.out.println("Match all digits: you win $3,000");
        else if (gd1 == lt1 || gd1 == lt2 || gd2 == lt1 || gd2 == lt2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
