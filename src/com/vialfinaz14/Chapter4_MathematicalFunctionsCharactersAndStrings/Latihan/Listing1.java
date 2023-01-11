package com.vialfinaz14.Chapter4.Latihan;

import java.util.Scanner;

public class Listing1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x,f;
        System.out.println("Masukan nilai x: ");
        x = input.nextDouble();

        f =(x + 2) * x;
        System.out.println("Fungsi dari f(x) adalah " + f);
    }
}
