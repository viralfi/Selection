package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises35_areaofaPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
