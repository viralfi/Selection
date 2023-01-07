package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises18C {
    public static void main(String[] args) {
        int numberOfLine = 6;

        System.out.println("Pattern C");
        for (int b = 1; b <= numberOfLine; b++){
            for (int k = numberOfLine - b; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int col = b; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
