package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises3 {
    public static void main(String[] args) {
        final double PoundsPerKilogram = 2.2;

        System.out.println("Kilograms         Pounds");
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf("%-15d%6.1f\n", i, (i * PoundsPerKilogram));
        }
    }
}
