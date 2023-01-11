package com.vialfinaz14.Chapter5_Loops.Tugas;

import kotlin.jvm.internal.MagicApiIntrinsics;

public class Exercises25ComputeR {
    public static void main(String[] args) {
        double sum = 0;
        double value = 10000.0;

        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        double pi = 4 * sum;
        System.out.println("PI value for i = 10000: " + pi);

        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;
        System.out.println("PI value for i = 20000: " + pi);

        sum = 0;
        value = 100000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 /d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;
        System.out.println("PI value for i = 100000: " + pi);
    }
}
