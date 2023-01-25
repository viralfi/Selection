package com.vialfinaz14.Chapter6_Methods.Tugas;

public class Exercises13_SumSeries {
    public static void main(String[] args) {
        double seriesStart = 1.0;
        double numberoffrows = 20.0;

        System.out.println("\ni       m(i)    ");
        System.out.println("-------------------");
        for (double i = seriesStart; i <= numberoffrows; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sumseries(i));
        }
    }
    public static double sumseries(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i +1);
        }
        return sum;
    }
}
