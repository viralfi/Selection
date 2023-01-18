package com.vialfinaz14.Chapter6_Methods.Latihan;

public class Listing4_Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Sebelum panggilan, x adalah " + x);
        increment(x);
        System.out.println("Setelah panggilan, x adalah " + x);
    }
    public static void increment(int n){
        n++;
        System.out.println("n di dalam methode adalah " + n);
    }
}
