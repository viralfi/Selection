package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

public class Exercises7_CountSingleDigits {
    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 1; i <= 100; i++) {
            count[(int)(Math.random() * 10)] ++;
        }
        System.out.println("Hitung setiap angka di antara 0 dan 9: ");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "s: " + count[i]);
        }
    }
}
