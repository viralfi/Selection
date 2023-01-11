package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises5KiloToPoundAndPoundToKilo {
    public static void main(String[] args) {
        final double PoundsPerKilogram = 2.2;

        System.out.println("Kilograms     Pounds    |    Pounds        Kilograms");
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf("%-12d%7.1f", k, (k * PoundsPerKilogram));
            System.out.print("     |     ");
            System.out.printf("%-9d%12.2f\n", p, (p / PoundsPerKilogram));
        }
    }
}
