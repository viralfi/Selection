package com.vialfinaz14.Chapter8_ArrayMultidimensional.Tugas;

import java.util.Scanner;

public class Exercises1_SumElementColumnByColumn {
    public static void main(String[] args) {
        double[][] matrix = getmatrix();

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the element at column " + col +
                    " is " + sumcolumn(matrix, col));
        }
    }
    public static double[][] getmatrix() {
        Scanner input = new Scanner(System.in);
        final int rows = 3;
        final int colums = 4;
        double[][] m = new double[rows][colums];

        System.out.println("Enter a " + rows + "-by-" +
                colums + " matrix row by row: ");
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m[row].length; col++)
                m[row][col] = input.nextDouble();
        return m;
    }
    public static double sumcolumn(double[][] m, int columnindex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnindex];
        }
        return sum;
    }
}
