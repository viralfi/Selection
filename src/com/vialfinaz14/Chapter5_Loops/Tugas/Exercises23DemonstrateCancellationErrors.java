package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises23DemonstrateCancellationErrors {
    public static void main(String[] args) {
        double sumLTR = 0.0;
        for (double i = 1.0; i <= 50000.0; i++) {
            sumLTR += 1 /i;
        }
        System.out.println("Summat ion of series left to righ: " + sumLTR);
        double sumRTL = 0.0;
        for (double i = 50000.0; i >= 1.0; i--) {
            sumRTL += 1 / i;
        }
        System.out.println("Summat ion of series right to left - " +
                "Summat of the series left to righ: " + (sumRTL - sumLTR));
    }
}
