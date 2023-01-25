package com.vialfinaz14.Chapter6_Methods;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class PengurutanAngka {
    public static void main(String[] args) {
       int temp = 0, b, k, i, j;
       int a[] = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
       System.out.println("Sebelum di urutkan: ");

       for (i = 0; i < 10; i++) {
          System.out.print(a[i] + "  ");
       }
       for (b = 0; b < 10; b++) {
          for (k = 0; k < 9; k++) {
             if (a[k] > a[k + 1]) {
                temp = a[k];
                a[k] = a[k + 1];
                a[k + 1] = temp;
             }
          }
       }
       System.out.println("\n\nSetelah diurutkan: ");
       for (j = 0; j < 10; j++) {
          System.out.print(a[j] + "  ");
       }
    }
}
