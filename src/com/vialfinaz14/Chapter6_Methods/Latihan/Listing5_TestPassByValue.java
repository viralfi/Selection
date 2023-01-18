package com.vialfinaz14.Chapter6_Methods.Latihan;

public class Listing5_TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        System.out.println("Sebelum memanggil metode swap, num1 adalah " +
                num1 + " dan num2 adalah " + num2);
        swap(num1, num2);
        System.out.println("Setelah menggunakan metode swap, num1 adalah " +
                num1 + " dan num2 adalah " + num2);
    }
    public static void swap(int ni, int n2) {
        System.out.println("\tdidalam metode swap");
        System.out.println("\t\tSebelum bertukar, n1 adalah " + ni +
                " dan n2 adalah " + n2);
        int temp = ni;
        ni = n2;
        n2 = temp;
        System.out.println("\t\tsesudah bertukar, ni1 adalah " + ni +
                " dan n2 adalah " + n2);
    }
}
