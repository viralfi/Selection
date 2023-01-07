package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises18D {
    public static void main(String[] args) {

        System.out.println("Pattern D");
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - a; col++) {
                System.out.print((col + 1) + " ");
            }
            System.out.println();
        }
    }
}
