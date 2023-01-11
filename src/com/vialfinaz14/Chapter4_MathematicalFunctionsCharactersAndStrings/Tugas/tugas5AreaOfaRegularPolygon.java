package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;

public class tugas5AreaOfaRegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");
        double n = input.nextDouble();
        System.out.println("Enter the side: ");
        double s = input.nextDouble();

        double arae = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of polygon is " + arae);
    }
}
