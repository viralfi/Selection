package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

import java.util.Scanner;

public class Exercises13_TheLocationClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and column in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] array = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        Location max = locateLargest(array);
        System.out.println("The location of the largest element is " +
                max.maxValue + " at (" + max.row + ", " + max.column + ")");
    }
    public static Location locateLargest(double[][] a) {
        return new Location(a);
    }
}
//*********************************************************************************
// * (The Location class) Design a class named Location for locating a maximal      *
// * value and its location in a two-dimensional array. The class contains public   *
// * data fields row, column, and maxValue that store the maximal value and its     *
// * indices in a two-dimensional array with row and column as int types and        *
// * maxValue as a double type.                                                     *
// *                                                                                *
// * Write the following method that returns the location of the largest element in *
// * a two-dimensional array:                                                       *
// *                                                                                *
// * public static Location locateLargest(double[][] a)                             *
// *                                                                                *
// * The return value is an instance of Location. Write a test program that prompts *
// * the user to enter a two-dimensional array and displays the location of the     *
// * largest element in the array.                                                  *
// *********************************************************************************/