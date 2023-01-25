package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises17_DisplayMatrixof0sand1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = input.nextInt();
        printmatrix(n);
    }
    public static void printmatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print((int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}
