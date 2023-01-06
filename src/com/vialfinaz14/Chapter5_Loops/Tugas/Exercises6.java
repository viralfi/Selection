package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises6 {
    public static void main(String[] args) {
        final double KilometrsPerMile = 1.609;

        System.out.println("Mile      Kilometers    |    Kilometer     Miles");
        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            System.out.printf("%-11d%-10.3f", m, (m * KilometrsPerMile));
            System.out.print("   |    ");
            System.out.printf("%-15d%-6.3f\n", k, (k * KilometrsPerMile));
        }
    }
}
