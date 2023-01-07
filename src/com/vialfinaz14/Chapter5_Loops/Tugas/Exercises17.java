package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the number of lines: ");
        int nol = input.nextInt();
        for (int rows = 1; rows <= nol; rows++) {
            for (int s = nol - rows; s >= 1; s--) {
                System.out.print("   ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + "  ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + "  ");
            }
            System.out.println();
        }
    }
}
