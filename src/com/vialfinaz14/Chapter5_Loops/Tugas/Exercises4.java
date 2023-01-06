package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        final  double KilometerPerMili =1.609;

        System.out.println("Miles        Kilometers");
        for (int i = 1; i <= 10; i++){
            System.out.printf("%-13d%-10.3f\n", i, (i * KilometerPerMili));
        }
    }
}
