package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) {
        final int NumberPerLine = 10;
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                if (count % NumberPerLine == 0)
                    System.out.println(i);
                else
                    System.out.print(i + "");
            }
        }
    }
}
