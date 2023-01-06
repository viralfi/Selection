package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double s = input.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is " + String.format("%.2f", area));
    }
}
