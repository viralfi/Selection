package com.vialfinaz14.Chapter8_ArrayMultidimensional.Latihan;

import java.util.Scanner;

public class Listing4_CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] grid = readasolation();

        System.out.println(isvalid(grid) ? "Valid solution" : " Invalid" +
                "solution");
    }
    public static int[][] readasolation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sudoku puzzle solution: ");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();
        return grid;
    }
    public static boolean isvalid(int[][] grid) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9
                || !isvalid(i, j, grid))
                    return false;
        return true;
    }
    public static boolean isvalid(int i, int j, int[][] grid) {
        for (int column = 0; column < 9; column++)
            if (column != j && grid[i][column] == grid[i][j])
                return false;
        for (int row = 0; row < 9; row++)
            if (row != i && grid[row][j] == grid[i][j])
                return false;
        for (int row = (i / 3) * 3; row < (i / 3) * 3; row++)
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if (row != i && col != j && grid[row][col] == grid[i][j])
                    return false;
        return true;
    }
}
