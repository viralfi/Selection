package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises18B {
    public static void main(String[] args) {

        System.out.println("pattern B");
        for (int r = 6; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
